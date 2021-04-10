package helloWorld;

public class function {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      addition(2,3);
      addition(5,3);
      addition(3,3);
      
      
//      int addResult = additionRetrn(4,5);
      
      System.out.println("Result is :"+additionRetrn(4,5));
      System.out.println("Result is :"+additionRetrn(3,5));
      System.out.println("Result is :"+additionRetrn(2,5));
		
	}
	
public static void  addition( int number1 ,  int number2) {
		
		int result= number1 + number2;
		System.out.println(result);
	}
public static int  additionRetrn( int number1 ,  int number2) {
	
	int result= number1 + number2;
	return result;
}




}
