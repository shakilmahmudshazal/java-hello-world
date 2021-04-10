package helloWorld;
import java.util.Scanner;
public class grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Type your Number:");
		float number = input.nextFloat();
		
		if(number>=80 && number<=100) 
		{
			System.out.print("your grade is 4.00");
		}
		else if(number>=75 && number<=79) 
		{
			System.out.print("your grade is 3.75");
		}
		else if(number>=70 && number<=74)
		{
			System.out.print("your grade is 3.50");
		}
		else 
		{
			System.out.print("your grade is 0.00");
		}

	}

}

