class Person{
	String name;
	int id; 

	Person(int id, String name){
		this.id = id;
		this.name = name;
	}
}

class Employee extends Person{
	float salary;
	Employee(int id , String name , float salary){
		super(id,name);
		this.salary = salary;
	}
	void display(){
		System.out.println("The id is " + id + " name is " +name + " and the salary is " + salary);
	}

}

public class superkeyreallife{
	public static void main(String [] args){
		Employee emp  = new Employee(1, "Saransh", 130000);
		emp.display();
	}
}


