public class FindLongestWord{
	
	public static String longestWord(String str){
		String arr[] = str.split(" ");
		int max = arr[0].length();
		int index=0;
		for(int i = 0; i < arr.length; i++){
			if(max < arr[i].length()){
				max = arr[i].length();
				index = i;
			}
		}
		return arr[index];
	}
	
	public static void main(String [] args){
	String str = "Capgemini training offered by bridge lab";
	System.out.println("Longest word is : " + longestWord(str));
	
	}
}
	
	