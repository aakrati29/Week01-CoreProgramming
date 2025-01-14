import java.util.*;
public class Anagram{
	
	public static boolean isAnagram(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		str1 = str1.replaceAll("//s" , " ").toLowerCase();
		str2 = str2.replaceAll("//s" , " ").toLowerCase();
		
		char arrOne[] = str1.toCharArray();
		char arrTwo[] = str2.toCharArray();
		
		Arrays.sort(arrOne);
		Arrays.sort(arrTwo);
		
		return Arrays.equals(arrOne,arrTwo);
	}
	

	public static void main(String [] args){
	Scanner s = new Scanner(System.in);
	String str1 = s.nextLine();
	String str2 = s.nextLine();
	
	if(isAnagram(str1, str2)){
		System.out.println(str1 + " and " + str2 + " these strings are anagram");
	}
	
	else{
		System.out.println(str1 + " and " + str2 + " these strings are not anagram");
	}
  }
}
