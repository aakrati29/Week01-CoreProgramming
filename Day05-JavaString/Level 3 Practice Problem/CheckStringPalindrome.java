// Create a class CheckStringPalindrome to reverse a string
public class CheckStringPalindrome{

	//
	public static boolean isPalindrome(String str){
		int start = 0;
	    int end = str.length() - 1;
		
		while(start < end){
			if(str.charAt(start) != str.charAt(end)){
			return false;
		 }
			start++;
			end--;
		}
			return true;
	}
			

	public static void main(String[] args){
		String str  = "aba";
		
		if(isPalindrome(str)){
			System.out.println(str + " This string is palindrome");
		}
		else{
			System.out.println(str + " This string is not palindrome");
		}

	}
}
	