public class OccurenceOfSubstring{

    // create a method to count occurrences of a substring in a string
	public static int countSubstring(String str, String subString){
		int count = 0;
        int index = 0;

        // Loop to find the substring in the string
        while ((index = str.indexOf(subString, index)) != -1) {
            count++;
            index += subString.length();
        }

        return count;
	}

	public static void main(String[] args){
	String str = "practice problem";
	String subString = "pr";
	System.out.println("Number of sub string present in Sting : " + countSubstring(str, subString));
	}
}
	