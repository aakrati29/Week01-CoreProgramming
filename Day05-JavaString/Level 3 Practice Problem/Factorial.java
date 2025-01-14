public class Factorial{
    public static int factorial(int num){
        if(num == 0){
            return 1;
        }
		
		// Call function recursively
        int fnm1 = factorial(num-1);
        int fn = num * factorial(num-1);
        return fn;
    }    
    public static void main(String[] args) {
	
	// Create a object of Scanner class to take user input
	Scanner s  = new Scanner(System.in);
	int num = s.nextInt();
	
	// Call function and display result
	System.out.println(factorial(num));
    }
}
