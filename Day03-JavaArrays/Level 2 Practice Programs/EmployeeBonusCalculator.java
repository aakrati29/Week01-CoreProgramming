// Here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class EmployeeBonusCalculator {

    public static void main(String[] args) {
	
        // Create a object of Scanner class to take user input
        Scanner s = new Scanner(System.in);

        // Define the number of employees
        final int countEmployee = 10;

        // Take different Arrays to store employee details of type double
        double[] salary = new double[countEmployee];  
        double[] yearsOfService = new double[countEmployee];  
        double[] bonuses = new double[countEmployee];  
        double[] newSalary = new double[countEmployee]; 

        // Take variables to calculate total bonus, total old salary, and total new salary
        double totalBonus = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;

        // Loop to input salary and years of service for each employee
        for (int i = 0; i < countEmployee; i++) {
            // Get and validate salary input
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            while (true) {
                salary[i] = s.nextDouble();
                if (salary[i] <= 0) {
                    System.out.print("Invalid salary. Please enter a positive salary for employee " + (i + 1) + ": ");
                } else {
                    break;  // valid salary entered, break the loop
                }
            }

            // Get and validate years of service input
            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            while (true) {
                yearsOfService[i] = s.nextDouble();
                if (yearsOfService[i] < 0) {
                    System.out.print("Invalid years of service. Please enter a positive number for employee " + (i + 1) + ": ");
                } else {
                    break;  // valid years of service entered, break the loop
                }
            }
        }

        // Loop to calculate the bonus and new salary for each employee
        for (int i = 0; i < countEmployee; i++) {
		
            // Calculate bonus based on years of service
            if (yearsOfService[i] > 5) {
                bonuses[i] = salary[i] * 0.05;  // 5% bonus for employees with more than 5 years of service
            } 
			
			else {
                bonuses[i] = salary[i] * 0.02;  // 2% bonus for employees with less than or equal to 5 years of service
            }

            // Calculate new salary
            newSalary[i] = salary[i] + bonuses[i];

            // Update total calculations
            totalBonus += bonuses[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        // Display the bonus, old salary, and new salary for each employee
        System.out.println("\nEmployee Bonus and Salary Information : ");
        for (int i = 0; i < countEmployee; i++) {
            System.out.printf("Employee %d - Salary: %.2f, Years of Service: %.2f, Bonus: %.2f, New Salary: %.2f%n",
                    (i + 1), salary[i], yearsOfService[i], bonuses[i], newSalary[i]);
        }

        // Display the total bonus payout, total old salary, and total new salary
        System.out.printf("\nTotal Bonus Payout : %.2f%n", totalBonus);
        System.out.printf("Total Old Salary of All Employees : %.2f%n", totalOldSalary);
        System.out.printf("Total New Salary of All Employees : %.2f%n", totalNewSalary);

        // Close the scanner
        s.close();
    }
}
