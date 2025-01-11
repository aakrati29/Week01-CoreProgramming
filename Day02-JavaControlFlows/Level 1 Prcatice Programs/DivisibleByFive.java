import java.util.Scanner;

class DivisibleByFive {
    public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
        System.out.print("Enter a number : ");
		int number = s.nextInt();
		boolean isDivisible;
		
        // Checking if the number is divisible by 5
        if (number % 5 == 0) {
            isDivisible = true;
        } else {
            isDivisible = false;
        }
		
		//here print the number and it is divisible by five or not
		System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);
		sc.close();
    }
}