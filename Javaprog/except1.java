package exceptionhandling;

// try and catch block class test1{
public class test1{
	public static void main(String [] args){
		try{
			System.out.println(3/0);
			System.out.println("IN THE TRY BLOCK");
		}
		catch (ArithmeticException e){
			System.out.println("Exception :" + e.getMessage()); }finally{ System.out.println("Program continues");
		}
	}
}

