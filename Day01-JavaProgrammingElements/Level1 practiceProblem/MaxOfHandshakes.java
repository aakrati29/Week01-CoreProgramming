//here import all classes for access their inbuilt functions
import java.util.*;

//Create MaxOfHandshakes class to maximum number of handshake
public class MaxOfHandshakes{

    public static void main(String [] args){
	
	//create object of scanner class to take input
	Scanner s = new scanner(System.in);
	
	//here take input of number of students and store in numberOfStudents variable
	int numberOfStudents = s.nextInt();
	
	//calculale maximum number of handshakes and store in possibleHandshakes variable
	int possibleHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;
	System.out.println("Display the number of possible handshakes " + possibleHandshakes);
	}
}