public class Multithread {
	
	public static void main(String [] args){

		for (int i = 1; i <=3 ; i++){
			Multithreadthing myThing = new Multithreadthing(i);
			Thread myThread = new  Thread(myThing);
			myThread.start();
		}
	}
}

