import java.util.Scanner;

class EligibleToVote{
    public static void main(String[] args) {

		//create object of scanner class
        Scanner s = new Scanner(System.in);

        //Taking age as input from user
        System.out.print("Enter the person's age : ");
		
		// Store the input in the age variable
        int age = s.nextInt(); 

        //Check if the person is eligible to vote
        if (age >= 18) {
            System.out.println("The person's age is " + age + " and can vote");
        } else {
            System.out.println("The person's age is " + age + " and cannot vote");
        }

        s.close();
    }
}