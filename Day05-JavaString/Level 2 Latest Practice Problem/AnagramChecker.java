import java.util.*;

// Create a class AnagramChecker for checking
public class AnagramChecker{
    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);
        
        // Take input from user for two strings
        System.out.print("Enter first string : ");
        String str1 = s.nextLine();
        
        System.out.print("Enter second string : ");
        String str2 = s.nextLine();
        
        // Sort both strings and compare
        if (str1.length() != str2.length()) {
            System.out.println("The strings are not anagrams.");
        } 
		
		else {
            char[] a1 = str1.toCharArray();
            char[] a2 = str2.toCharArray();
            
            // Sorting both strings
            Arrays.sort(a1);
            Arrays.sort(a2);
            
            // Compare sorted arrays
            if (Arrays.equals(a1, a2)) {
                System.out.println("The strings are anagrams.");
            } 
			
			else {
                System.out.println("The strings are not anagrams.");
            }
        }
    }
}
