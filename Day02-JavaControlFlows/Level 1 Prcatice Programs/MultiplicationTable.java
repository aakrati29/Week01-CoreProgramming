//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class MultiplicationTable{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        //Taking as input
        System.out.print("Enter a number to generate its multiplication table : ");
        int number = s.nextInt();

        //Generating multiplication table of given number
		for (int currentMultiplier = 1; currentMultiplier <= 10; currentMultiplier++) {
            System.out.println(number + " x " + currentMultiplier + " = " + (number * currentMultiplier));
        }

        s.close();
    }
}
