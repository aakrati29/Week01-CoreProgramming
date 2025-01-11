//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class FindMultipleOfaNumber {
    public static void main(String[] args) {
        
		//create object of scanner class to take input
        Scanner s = new Scanner(System.in);
        
        //take input from user and store in number variable
        System.out.print("Enter a number: ");
        int number = s.nextInt();
        
        System.out.println("Multiples of " + number + " below 100 are : ");
         
        //Loop to find multiples, running backward
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }
        
        s.close();
    }
}
