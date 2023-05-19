import java.util.*;
 class School{
	int id = 1;
	String name = "Saint Thomas School";

	void printId(){
		System.out.println("Id is : " + this.id);
	}
}
public class supermethos extends School  { 
		int id = 10;	
		void  printSchoolName(){
			System.out.println("School name is :" + super.name);
		}

		void printID(){
			System.out.println("Teacher ID : " + this.id);
			super.printId();
		}
		
		public static void main(String[] args){
			supermethos ob = new supermethos();
			ob.printID();
		}
	}

