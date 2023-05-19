abstract class Bike{
	// constructor of bike class 
	Bike(){
		System.out.println("bike is created");
	}
	// abstract method 
	abstract void run();

	void changeGear(){
		System.out.println("gear changes");
	}
}


class honda extends Bike{
	void run(){
		System.out.println("running safely");
	}
}

class Abstractionex {
	public static void main(String [] args){
		Bike obj = new honda();
		obj.run();
		obj.changeGear();
	}
}

