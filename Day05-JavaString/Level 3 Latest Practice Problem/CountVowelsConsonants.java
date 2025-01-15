import java.util.*;

//Creating class CountVowelsConsonants for finding
public class CountVowelsConsonants {

    public static int[] countVowelsConsonants(String str) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i));

				if (ch >= 'a' && ch <= 'z') {
					if ("aeiou".indexOf(ch) >= 0) {
					vowels++;
				}
				else{
					consonants++;
				}
			}
		}

        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
	
		// Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);
		
		//Taking input from user
        System.out.print("Enter a string : ");
        String str = s.nextLine();

        int[] ans = countVowelsConsonants(str);
		
		// Display the result
        System.out.println("Number of Vowels are : " + ans[0]);
        System.out.println("Number of Consonants are : " + ans[1]);
		
		//Closing Scanner class object
        s.close();
    }
}