import java.util.HashSet;
import java.util.Random;

public class OTPGenerator {

    public static String generateOTP() {
        Random random = new Random();
        int otp = 100000 + random.nextInt(900000);
        return String.valueOf(otp);
    }

    public static boolean areUnique(String[] otps) {
        HashSet<String> set = new HashSet<>();
        for (String otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] otps = new String[10];
        for (int i = 0; i < 10; i++) otps[i] = generateOTP();
        System.out.println("Generated OTPs:");
        for (String otp : otps) System.out.println(otp);
        System.out.println("Are all OTPs unique? " + areUnique(otps));
    }
}
