package helloWorld;
import java.util.Scanner;

public class Exam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.print("Type your number:");
		float number = input.nextFloat();
		String result=grading(number);
		System.out.print("Reuslt :"+ result);

	}
	
	static String grading (float number) {
	if(number>=33 && number<=100) 
	{
		return "passed";
	}
	
	else 
	{
		return "failed";
	}
   }

}
