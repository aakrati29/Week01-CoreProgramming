//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

class SumUntilZeroUsingWhile{
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);
	 
		//Initialize total as zero
        int total = 0; 

        //Taking input from user and continuing the process until 0 is entered
        while(true){
            System.out.print("Enter a Number (Enter 0 to stop) : ");
            int number = s.nextInt();
            if (number == 0) {
                break; // Exit the loop if input is 0
            }
			
			//Add input to total
            total += number; 
        }

        System.out.println("The total sum is : " + total);
        s.close();
    }
}
