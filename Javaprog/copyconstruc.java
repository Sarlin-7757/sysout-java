// there is no copy constructor in java, but we can still copy values of one object to another

class Student {
	int id; 
	String name;
	int age;

// constructor 
	Student(int id , String name){
		this.id = id;
		this.name = name;
	}

// copy constructor
	 Student(Student s){
		 id = s.id;
		 name = s.name;
	}

	void display(){
		System.out.println("The name is : " + name + " and the id is : " + id );
	}


	public static void main(String[] args){
		Student s1 = new Student(10, "Saransh");
		Student s2 = new Student(s1);
		s1.display();
		s2.display();
	}
}
