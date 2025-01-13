// Create a clss CountVowelsandConsonants to calculate number of vowels and consonants
public class CountVowelsandConsonants{
	public static void main(String[] args){
		
	// Create a String and store int variable str
	String str = "Hello world";
	
	// Initializing variables countVowels and countConsonants with zero
	int countVowels = 0;
	int countConsonants = 0;
	
	// For itrate over String using for loop
	for(int i = 0; i < str.length(); i++){
		if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
			countVowels++;
			}
			
			else{
				countConsonants++;
				}
	}
				
				// Print tottal number of vowels and consonants present in given string
				System.out.println("Total number of vowels are : " + countVowels);
				System.out.println("Total number of consonants are : " + countConsonants);
	}
}

			
