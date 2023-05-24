class School{
	int id;
	String name = "Saint Thomas School";
}

class Teacher extends School{
	int id;
	String name = "Brms";

	void printSchoolName() {
		// using super.name we can access the parent class name variable 
		// using this.name we can access the child class name variable 
		System.out.println("School name is : " + super.name);
		System.out.println("School name is :" + this.name);
	}

	public static void main(String[]args){
		Teacher t = new Teacher();
		t.printSchoolName();
	}
}
