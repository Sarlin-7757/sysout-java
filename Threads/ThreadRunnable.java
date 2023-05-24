

class ThreadExample1 implements Runnable{
	public void run(){
		System.out.println("Thread is not a threat");
	}
}

class ThreadExample2 implements Runnable{
	public void run(){
		System.out.println("This is thread 2");
	}
}


public class ThreadRunnable {
	public static void main(String [] args){
		ThreadExample1 bullet1 = new ThreadExample1();
		Thread gun1 = new Thread(bullet1);
		ThreadExample2 bullet2 = new ThreadExample2();
		Thread gun2 = new Thread(bullet2);

		gun1.start();
		gun2.start();
		}
}
