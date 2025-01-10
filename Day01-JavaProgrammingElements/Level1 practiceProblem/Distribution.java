//Create Distribution class to distribute pens among students
public class Distribution{

    public static void main(String [] args){
	
	//create a variable pen of integer type to stored the value of pens
	int pen = 14;
	
	//create a variable student of integer type to stored the value of student
	int students = 3;
	
	//create a variable remainingPen of integer type to stored the value of remaining pens which is not distributed
	int remainingPen = 14%3;
	
	//create a variable distributedPens of integer type to stored the value of how many pens are equally distributed
	int distributedPens = pen/ students;
	
	//here print the remaining pens and equally distributed among three students
	System.out.println("The Pen Per Student is " + remainingPen + " and the remaining pen not distributed is " + distributedPens);
	}
}
	