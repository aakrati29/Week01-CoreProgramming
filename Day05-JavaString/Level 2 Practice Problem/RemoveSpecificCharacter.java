public class RemoveSpecificCharacter {

	public static String removeSpecificCharacter(String str, char ch){
	StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			if(str.charAt(i) != ch){
				sb.append(str.charAt(i));
			}
		}
		return sb.toString();
	}
				
				
	
	public static void main(String[] args) {
		String str = "Hello world";
		char ch = 'l';
		System.out.println("Original string : " + str);
		System.out.println("Modified string : " + removeSpecificCharacter(str, ch));
	}
}
		
				
