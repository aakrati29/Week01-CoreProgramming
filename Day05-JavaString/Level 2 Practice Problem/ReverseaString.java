// Create a class ReverseaString to reverse a string
public class ReverseaString{
	
	// Create a function to reverse a string
	public static void reverseString(String str){
		
		// Create string builder to store reverse string                                                                                              
		StringBuilder sb = new StringBuilder();
		for(int i = str.length()-1; i >= 0; i--){
			
			// Append each character in reverse order in string builder
			sb.append(str.charAt(i));
		}
		
		System.out.println(sb.toString());
	}
	public static void main(String[] args){
		
	// Create a String and store int variable str
	String str = "Hello world";
	reverseString(str);
	}
}
		
	