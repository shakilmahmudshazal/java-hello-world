package helloWorld;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
 
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type your age:");
		float age = input.nextFloat();
		
		System.out.println("your age: "+age);
		if(age>=18 && age<=90) {
			System.out.println("You can vote");
		}else {
			System.out.println("You can't vote");
		}
		
	}

}
