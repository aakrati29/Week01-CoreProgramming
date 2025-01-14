import java.util.*;
public class FibonacciSequenceGenerator{

	public static void printFibonacciSerie(int num){
		int firstNum = 0;
		int secondNum = 1;
		System.out.println(firstNum + " " + secondNum);
		
		for(int i = 2; i < num; i++){
			int thirdNum = firstNum + secondNum;
            System.out.print(" " + thirdNum);
			
			// Update firstNum
            firstNum = secondNum; 
			
			// Update secondNum
            secondNum = thirdNum; 
        } 
    }
	public static void main(String [] args){
	
	// Create a object of Scanner class to take user input
	Scanner s  = new Scanner(System.in);
	int num = s.nextInt();
	printFibonacciSerie(num);
	}
}
	