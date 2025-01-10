//Create HeightConversion class to conversion height from cm to inches and feet
public class HeightConversion{

    public static void main(String [] args){
	
	//create a variable heightInCentimeter of type double to store height in cm
	double heightInCentimeter = 2.54;
	
	//create a variable heightInInches of type double to store height in inches
	double heightInInches = heightInCentimeter/2.54;
	
	//create a variable heightInFeet of type double to store height in feet and also do type conversion to int
	int heightInFeet = (int) heightInInches/12;
	
	//here calculate the height in inches
	heightInInches = heightInInches%12;
	
	//here print the height in cm, inches and in feet
	Sytem.out.println("Your Height in cm is " + heightInCentimeter + " while in feet is " + heightInFeet + " and inches is " + heightInInches);
}
}	
	