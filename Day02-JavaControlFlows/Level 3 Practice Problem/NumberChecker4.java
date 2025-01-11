// Create a class NumberChecker4 to perform some task
public class NumberChecker4 {

    // Create a method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
		
		// Numbers less than or equal to 1 are not prime
            return false; 
        }

        // Check for divisors from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
		
		// If no divisors were found, the number is prime
        return true; 
    }

    // Create a method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;

        // Sum the digits of the square
        while (square > 0) {
		
			// Add the last digit of the square
            sum += square % 10; 
			
			// Remove the last digit
            square /= 10; 
        }

        return sum == number; 
    }

    // Create a method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0, product = 1;
        
        // Calculate the sum and product of the digits
        while (number > 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }

        return sum == product; 
    }

    // Create a method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        int temp = number;

        // Check if the square ends with the number itself
        while (square > 0 && temp > 0) {
            if (square % 10 != temp % 10) {
			
			// If any digit does not match, it's not automorphic
                return false; 
            }
			
            square /= 10;
            temp /= 10;
        }
		
		// If all digits match, it's an automorphic number
        return true; 
    }

    // Create a method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
	
	// A number is a buzz number if it's divisible by 7 or ends with 7
        return number % 7 == 0 || number % 10 == 7; 
    }

    public static void main(String[] args) {
        // Sample number for testing
        int number = 28;

        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is " + number + " a prime number? " + prime);

        // Check if the number is neon
        boolean neon = isNeon(number);
        System.out.println("Is " + number + " a neon number? " + neon);

        // Check if the number is a spy number
        boolean spy = isSpy(number);
        System.out.println("Is " + number + " a spy number? " + spy);

        // Check if the number is automorphic
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is " + number + " an automorphic number? " + automorphic);

        // Check if the number is buzz
        boolean buzz = isBuzz(number);
        System.out.println("Is " + number + " a buzz number? " + buzz);
    }
}
