class Student {
	public static void main(String[] args){
		Student s1 = new Student();
		s1 = null;
		System.gc();
		System.out.println("Garbage collector is called");

	}

	@Override
	// finalize is deprecated now 
	protected void finalize(){
		System.out.println("Finalize method is called");
	}
}
