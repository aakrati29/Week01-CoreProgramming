//here import all classes so that we can use their inbuilt functions
import java.util.Scanner;

public class FriendsAgeComparison {
    public static void main(String[] args) {
	
		//create object of scanner class to take input
        Scanner s = new Scanner(System.in);

        // Input age and height of Amar
        System.out.print("Enter Amar's age: ");
        int amarAge = s.nextInt();
		
        System.out.print("Enter Amar's height: ");
        int amarHeight = s.nextInt();

        // Input age and height of Akbar
        System.out.print("Enter Akbar's age: ");
        int akbarAge = s.nextInt();
		
        System.out.print("Enter Akbar's height: ");
        int akbarHeight = s.nextInt();

        // Input age and height of Anthony
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = s.nextInt();
		
        System.out.print("Enter Anthony's height: ");
        int anthonyHeight = s.nextInt();

        // Determine the youngest friend
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = "";
        if (youngestAge == amarAge) {
            youngestFriend = "Amar";
        } 
		else if (youngestAge == akbarAge) {
            youngestFriend = "Akbar";
        } 
		else {
            youngestFriend = "Anthony";
        }

        //Determine the tallest friend among three
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = "";
        if (tallestHeight == amarHeight) {
            tallestFriend = "Amar";
        } 
		else if (tallestHeight == akbarHeight) {
            tallestFriend = "Akbar";
        } 
		else {
            tallestFriend = "Anthony";
        }

        //Display results
        System.out.println("The youngest friend is: " + youngestFriend + " and Age is: " + youngestAge + " cm ");
        System.out.println("Largest of the 3 heights is: " + tallestFriend + " and Height is: " + tallestHeight + "cm");

        s.close();
    }
}
