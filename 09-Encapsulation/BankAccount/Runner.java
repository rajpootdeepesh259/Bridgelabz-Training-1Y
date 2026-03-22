package com.bank;

public class Runner {
    public static void main(String[] args) {

        BankAccount acc1 = new SavingsAccount("S101", "Loknath", 8000);
        BankAccount acc2 = new CurrentAccount("C102", "Rahul", 15000);

        BankAccount[] accounts = {acc1, acc2};

        for (BankAccount acc : accounts) {
            acc.displayAccountInfo();

            acc.deposit(2000);
            acc.withdraw(1000);

            double interest = acc.calculateInterest(); 
            System.out.println("Interest: " + interest);

            System.out.println("----------------------------");
        }

        Loanable loanAcc = new SavingsAccount("S103", "Amit", 6000);
        loanAcc.applyForLoan(20000);

        if (loanAcc.calculateLoanEligibility()) {
            System.out.println("Loan Approved ✅");
        } else {
            System.out.println("Loan Rejected ❌");
        }
    }
}