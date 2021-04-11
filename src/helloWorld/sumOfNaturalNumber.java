package helloWorld;

import java.util.Scanner;

public class sumOfNaturalNumber {
	
	
	public static int sumOfNN(int target)
	{
		int i=1;
		int sum=0;
		while(i<=target)
		{
			sum= sum +i;
			i++;
		}
		
		return sum;
	}
   
	
	public static void main(String[] args) {
    
		
		Scanner input = new Scanner(System.in);
		
		int target = input.nextInt();
		
		int result= sumOfNN(target);
		
		
		System.out.println("here "+result);
		
	}
}
