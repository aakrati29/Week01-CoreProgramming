// Here import hashset and set to use their inbuilt functions
import java.util.HashSet;
import java.util.Set;

// Create a class OTPGenerator to generate OTP
public class OTPGenerator {

	// Create a method to generate a 6-digit OTP number
    public static int generateOTP() {
	
        // Use random function to generate a random 6-digit number
        int otp = (int) (Math.random() * 900000) + 100000;
		
		// Return the generated OTP
        return otp; 
    }

     // Create a method to check if the OTP numbers are unique
		public static boolean areOTPsUnique(int[] otps) {
        Set<Integer> otpSet = new HashSet<>();

        for (int otp : otps) {
		
            // If the OTP already exists in the set, it's not unique
            if (!otpSet.add(otp)) {
			
				// Return false if a duplicate OTP is found
                return false; 
            }
        }

        // Return true if all OTPs are unique
        return true;
    }

    public static void main(String[] args) {
	
        // Array to store 10 OTPs
        int[] otps = new int[10];

        // Generate 10 OTPs and store them in the array
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("Generated OTP #" + (i + 1) + " : " + otps[i]);
        }

        // Check if all OTPs are unique
        boolean unique = areOTPsUnique(otps);
        
        // Print the result
        if (unique) {
            System.out.println("All OTPs are unique.");
        } 
		
		else {
            System.out.println("There are duplicate OTPs.");
        }
    }
}
