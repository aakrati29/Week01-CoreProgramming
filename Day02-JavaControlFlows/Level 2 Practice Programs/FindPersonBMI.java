import java.util.Scanner;
class FindPersonBMI{
	public static void main(String[] args){
	
		//create object of scanner class to take input
		Scanner s = new Scanner(System.in);
		
		//taking input from user weight in kg and height in cm
		System.out.print("Enter your weight : ");
		double weightInKg =  s.nextDouble();
		
		System.out.print("Enter your height : ");
		double heightInCm =  s.nextDouble();
		
		//Converting height from cm to meter 
		double heightInMeter = heightInCm / 100;
		
		//Calculating BMI of person
		double bmi = weightInKg / (heightInMeter * heightInMeter);
		
		//Checking condition of Underweight
		if (18.4 >= bmi ){
			System.out.print("Your are Underweight");
		}
		
		//Checking condition of Normal
		else if(18.5 <= bmi && bmi <= 24.9){
			System.out.print("Your are Normal");
		}
		
		//Checking condition of Overweight
		else if(25.0 <= bmi && bmi <= 39.9){
			System.out.print("Your are Overweight");
		}
		
		//Checking condition of Obese
		else {
			System.out.print("Your are Obese");
		}
		
	}
}