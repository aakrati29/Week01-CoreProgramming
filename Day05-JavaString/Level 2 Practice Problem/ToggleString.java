public class ToggleString{

	public static String toggledString(String str){
	StringBuilder sb = new StringBuilder();
		for(int i = 0; i < str.length(); i++){
			char ch = str.CharAt(i);
		    if(character.toUpperCase(ch)){
				sb.append(character.toLowerCase(ch));
				}
			else{
				sb.append(character.toUpperCase(ch));
			}
		}
		return sb.toString();
	}
			
	public static void main(String [] args){
	String str = "CapGemiNi";
	System.out.println("Final String is : " + toggledString(str));
	}
}
	
	