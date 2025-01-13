import java.util.*;

public class CompareStringsLexicographically {

	public static int compareString(String str1, String str2){
		int length1 = str1.length();
		int length2 = str2.length();
		int minlen = Math.min(length1, length2);
	
		for(int i = 0; i < minlen; i++){
			char ch1 = str1.charAt(i);
			char ch2 = str2.charAt(i);
			if(ch1 != ch2){
				return ch1 - ch2;
		}
	}
	
		return length1 - length2;
}

    public static void main(String[] args) {
		String str1 = "apple";
		String str2 = "banana";
		int result = compareString(str1, str2);
		if(result > 0){
			System.out.println(str1 + " comes before " + str2 + " in lexicographical order");
		}

		else{
			System.out.println(str1 + " comes after " + str2 + " in lexicographical order");
		}
	
    }
}

		
	
	
			
			