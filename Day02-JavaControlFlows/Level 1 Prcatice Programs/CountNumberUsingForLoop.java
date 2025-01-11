//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class CountNumberUsingForLoop{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        //Get the countdown start value
        System.out.print("Enter the starting value for countdown : ");
        int count = s.nextInt();

        //Perform the countdown by using for loop
        for (int i = count; i >= 1; i--) {
            System.out.println(i);
        }

        s.close();
    }
}