//import scanner class so that we can use their inbuilt function
import java.util.Scanner;

public class CalculateGrade {
    public static void main(String[] args) {
	
		//create object of scanner class
        Scanner s = new Scanner(System.in);

        //Taking as input Marks in Physics Chemistry and Maths
        System.out.print("Enter marks for Physics: ");
        int physics = s.nextInt();
		
        System.out.print("Enter marks for Chemistry: ");
        int chemistry = s.nextInt();
		
        System.out.print("Enter marks for Maths: ");
        int maths = s.nextInt();
	
	    //Calculate the total marks
        int totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 3.0);

        char grade;
        String remarks;
		
	    //checking the grade acquired
        if (percentage >= 80) {
            grade = 'A';
            remarks = "Level 4, above agency-normalized standards";
        } 
		else if (percentage >= 70) {
            grade = 'B';
            remarks = "Level 3, at agency-normalized standards";
        } 
		else if (percentage >= 60) {
            grade = 'C';
            remarks = "Level 2, below but approaching agency-normalized standards";
        } 
		else if (percentage >= 50) {
            grade = 'D';
            remarks = "Level 1, well below agency-normalized standards";
        } 
		else if (percentage >= 40) {
            grade = 'E';
            remarks = "Level 1, too below agency-normalized standards";
        } 
		else {
            grade = 'R';
            remarks = "Remedial standards";
        }

        System.out.println("\nDisplay result below");
        System.out.println("Average Marks : " + percentage + "%");
        System.out.println("Grade : " + grade);
        System.out.println("Remarks : " + remarks);

        s.close();
    }
}
