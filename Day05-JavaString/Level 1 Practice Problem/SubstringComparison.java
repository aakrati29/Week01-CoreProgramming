import java.util.*;

public class SubstringComparison {

    // Method to create a substring using the charAt() method
    public static String substringUsingCharAt(String str, int start, int end) {
        StringBuilder sb = new StringBuilder();

        // Iterate from start index to end index and append characters to string builder
        for (int i = start; i < end; i++) {
            sb.append(str.charAt(i));
        }

        // Return the created substring
        return sb.toString();
    }

    // Method to compare two strings using the charAt() method
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
	
        // Compare lengths of both strings
        if (str1.length() != str2.length()) {
            return false; 
        }

        // Compare each character of both strings
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }

		// Strings are equal
        return true; 
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		String str = s.nextLine();

        int startIndex = s.nextInt();
        int endIndex = s.nextInt();
		
		System.out.println("Sub string by using charAt() method : " + substringUsingCharAt(str, startIndex, endIndex));
		System.out.println("Compare by using charAt() method : " + compareStringsUsingCharAt(substringUsingCharAt(str, startIndex, endIndex), str.substring(startIndex , endIndex)));
		System.out.println("By using built in method : " + str.substring(startIndex , endIndex));
		
    }
}
