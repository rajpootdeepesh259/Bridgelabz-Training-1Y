import java.util.HashSet;
import java.util.Arrays;

public class OTPGenerator {

    
    public static int generateOTP() {
        
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areOTPsUnique(int[] otps) {
        HashSet<Integer> set = new HashSet<>();
        for (int otp : otps) {
            set.add(otp);
        }
        return set.size() == otps.length;
    }

    public static void main(String[] args) {

        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
        }

        System.out.println("Generated OTPs: " + Arrays.toString(otps));

        if (areOTPsUnique(otps)) {
            System.out.println("All OTPs are unique!");
        } else {
            System.out.println("Some OTPs are repeated.");
        }
    }
}