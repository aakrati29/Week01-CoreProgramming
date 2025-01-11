public class DayOfWeek{
    public static void main(String[] args) {
	
		//Check for command line arguments
		if(args.length > 0){
		 
			//storing date in different variables
			int month = Integer.parseInt(args[0]);
			int date = Integer.parseInt(args[1]);
			int year = Integer.parseInt(args[2]);
			
			//calculation
			int year0 = year - (14 - month) / 12;
			int x = year0 + (year0 / 4) - (year0 / 100) + (year0 / 400);
			int month0 = month  +12 * ((14-month) / 12) - 2;
			int day0 = (date + x + 31 *month0 /12 ) % 7;
			
			//Display Result below
			System.out.print("The day0 on this date is ");
			switch(day0){
				case 0:
					System.out.println("Sunday");
					break;
				case 1:
					System.out.println("Monday");
					break;
				case 2:
					System.out.println("Tuesday");
					break;
				case 3:
					System.out.println("Wednesday");
					break;
				case 4:
					System.out.println("Thursday");
					break;
				case 5:
					System.out.println("Friday");
					break;
				case 6:
					System.out.println("Saturday");
					break;	
				default:
					System.out.println("Something went wrong");
					break;
			}
		}
		else{
			System.out.println("No command line argument found");
		}
        
    }
}