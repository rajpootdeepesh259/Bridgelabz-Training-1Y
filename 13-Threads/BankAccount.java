
class BankAccount implements Runnable {
    private String accountHolder;
    private String accountType;

    public BankAccount(String accountHolder, String accountType) {
        this.accountHolder = accountHolder;
        this.accountType = accountType;
    }

    @Override
    public void run() {
        try {
            for (int i = 1; i <= 3; i++) {
                System.out.println(
                    Thread.currentThread().getName() +
                    " (" + accountType + ") is checking balance... " +
                    "[Priority: " + Thread.currentThread().getPriority() + "]" +
                    " - Check " + i
                );

                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println(accountHolder + " thread interrupted.");
        }
    }
}

public class BankSimulation {
    public static void main(String[] args) {

        BankAccount premiumUser = new BankAccount("Alice", "Premium");
        BankAccount regularUser = new BankAccount("Bob", "Regular");
        BankAccount basicUser = new BankAccount("Charlie", "Basic");

        Thread t1 = new Thread(premiumUser, "Alice");
        Thread t2 = new Thread(regularUser, "Bob");
        Thread t3 = new Thread(basicUser, "Charlie");
		
        t1.setPriority(Thread.MAX_PRIORITY);   
        t2.setPriority(Thread.NORM_PRIORITY);  
        t3.setPriority(Thread.MIN_PRIORITY);   
		
        t1.start();
        t2.start();
        t3.start();
    }
}