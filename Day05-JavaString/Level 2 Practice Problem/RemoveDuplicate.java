public class RemoveDuplicate{

	public static void isDuplicateRemove(String str){
		StringBuilder sb = new StringBuilder();
		int asciiValue[] = new int[256];
		for(char ch : str.toCharArray()){
			if(asciiValue[ch]==0){
				sb.append(ch);
				
				asciiValue[ch]++;
			}
		}
		System.out.println(sb);

	}
		
	public static void main(String [] args){
		String str = "titexcellence";
		isDuplicateRemove(str);
	}
}
		
