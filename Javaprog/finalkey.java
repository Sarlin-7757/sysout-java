// example that final method gets inherited 

class Bike{
	final void run(){
		System.out.println(" running....");
		}
}

class Honda2 extends Bike{
	public static void main(String [] args){
		Honda2 honda = new Honda2();
		honda.run();
	}
}

