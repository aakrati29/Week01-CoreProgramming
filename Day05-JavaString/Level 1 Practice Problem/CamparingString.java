import java.util.*;
public class CamparingString{

	public static boolean isStringEqual(String str1, String str2){
		if(str1.length() != str2.length()){
			return false;
		}
		
		for(int i = 0; i < str1.length(); i++){
			if(str1.charAt(i) != str2.charAt(i)){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String [] args){
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		System.out.println("By built in method : " + str1.equals(str2));
		System.out.println("By using CharAt meyhod : " + isStringEqual(str1, str2));
	}
}