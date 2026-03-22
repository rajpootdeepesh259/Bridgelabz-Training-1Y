package Third;

class CreditCard implements Payment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " done via Credit Card.");
    }
}