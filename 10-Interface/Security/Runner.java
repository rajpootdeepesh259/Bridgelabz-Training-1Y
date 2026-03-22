package Five;

public class Runner {
    public static void main(String[] args) {

        String password = "Pass@123";

        if (SecurityUtils.isStrongPassword(password)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password");
        }
    }
}