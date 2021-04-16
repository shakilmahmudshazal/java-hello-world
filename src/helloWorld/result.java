package helloWorld;

import java.util.Scanner;

public class result {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner input = new Scanner(System.in);
		 
		 System.out.print("How many students: ");
		 int numberOfStudents= input.nextInt();
		 
		 int[] examNumber = new int[numberOfStudents];
		 
		 for(int i=0; i<numberOfStudents;i++)
		 {
			 System.out.print("type number " + i +":" );
			 int number = input.nextInt();
			 examNumber[i]= number;
		 }
		 
		 for(int i=0; i<numberOfStudents;i++)
		 {
			 System.out.println("Roll "+i+": "+examNumber[i]);
		 }
	}

}
