// default constructor
class Student{
	// int id;
	// String name;

	// void display(){
	// 	System.out.println(id+" " +name);
	// }
	
	int id;
	String name;
	int age;

	Student(int id , String name){
		this.id = id;
		this.name = name;
	}

	Student(int id , String name , int age){
		this.id= id;
		this.name=name;
		this.age=age;
	}

	void display(){
		System.out.println("The name of the student is" + " " +name + ", id is : "+id +" and age is :" +age);
	}

	public static void main(String[]args){
		// object of the class and constructor 
		Student s1 = new Student( 1 , "Saransh");
		Student s2 = new Student(2 , "Priyansh" , 21);

		s1.display();
		s2.display();
	}
}

