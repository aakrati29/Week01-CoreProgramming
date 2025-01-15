import java.util.*;

//creating class PalindromeChecker for checking
public class PalindromeChecker{

	// Create a method to Check palindrome
	public static boolean check(String text){
		boolean isPalindrome = true;
		for(int i = 0; i < text.length()/2; i++){
			if(text.charAt(i) != text.charAt(text.length()-i-1)){
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
	public static void main(String[] args){
		
		String text = "ababa";
		
		// Call method to get result
		boolean result = check(text);
		
		//Display the result
		System.out.println("Is Palindrome "+ text +" is : "+ result);
		
	}
}
