package com.bank;

public class SavingsAccount extends BankAccount implements Loanable {

    private static final double INTEREST_RATE = 0.04; 

    public SavingsAccount(String accNo, String name, double balance) {
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
        return getBalance() > 5000;
    }
}