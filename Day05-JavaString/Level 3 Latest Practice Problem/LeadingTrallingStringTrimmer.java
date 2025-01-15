public class LeadingTrallingStringTrimmer {

    // Create a method to find the start and end indices for trimming spaces
    public static int[] findTrimIndices(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Loop to find the first non-space character from the start
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Loop to find the last non-space character from the end
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        // Return start and end indices as an array
        return new int[]{start, end};
    }

    // Create a method to create a substring using charAt() method
    public static String createSubstring(String text, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i <= end; i++) {
            result.append(text.charAt(i));
        }
        return result.toString();
    }

    // Create a method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Input string with leading and trailing spaces
        String s = "   Hello, Capgemini!   ";

        // Trim spaces using charAt() method
        int[] indices = findTrimIndices(input);
        String trimmedByCustomMethod = createSubstring(input, indices[0], indices[1]);

        // Trim spaces using built-in trim() method
        String trimmedByBuiltInMethod = s.trim();

        // Compare both results using custom compare method
        boolean areEqual = compareStrings(trimmedByCustomMethod, trimmedByBuiltInMethod);

        //Display the results
        System.out.println("Original String : '" + input + "'");
        System.out.println("Trimmed using custom method : '" + trimmedByCustomMethod + "'");
        System.out.println("Trimmed using built-in method : '" + trimmedByBuiltInMethod + "'");
        System.out.println("Are both results identical? " + areEqual);
    }
}
