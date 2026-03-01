public class NullPointerException {

    public static void generateException() {
        String text = null;
        System.out.println("Length of text: " + text.length());
    }

    public static void handleException() {
        String text = null;   
        
        try {
            
            System.out.println("Length of text: " + text.length());
        } catch (NullPointerException: e) {
            System.out.println("NullPointerException caught successfully.");
            System.out.println("Exception message: " + e);
        }
    }

    public static void main(String[] args) {

        System.out.println(" Generating NullPointerException");
        
        generateException();


    }
}