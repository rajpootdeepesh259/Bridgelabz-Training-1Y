package com.bank;

public class CurrentAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.02; 

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public double calculateInterest() {
        return getBalance() * INTEREST_RATE;
    }

    @Override
    public void applyForLoan(double amount) {
        System.out.println("Applying for loan: " + amount);
    }

    @Override
    public boolean calculateLoanEligibility() {
        return getBalance() > 10000;
    }
}