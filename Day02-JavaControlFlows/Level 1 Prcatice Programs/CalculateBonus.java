//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class CalculateBonus{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        //Taking as input Employee's salary and years of service
        System.out.print("Enter the employee's salary : ");
        double salary = s.nextDouble();

        System.out.print("Enter the employee's years of service : ");
        int yearsOfService = s.nextInt();

        //Check if the employee is eligible for the bonus
        if (yearsOfService > 5) {
		
            //Calculating bonus
            double bonus = salary * 5 / 100;
            System.out.println("Bonus amount is INR " + bonus);
        }

		else {
            System.out.println("Employee is not eligible for bonus");
        }

        s.close();
    }
}
