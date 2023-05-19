public class Multithreadthing implements Runnable{
	
	private int threadNumber;

	public Multithreadthing(int threadNumber){
		this.threadNumber = threadNumber;
	}
	 
	@Override
	public void run(){	
		for(int i = 1 ; i <= 5; i++){
			System.out.println(i + " from thread " + threadNumber);
			if(threadNumber == 3){
				throw new RuntimeException("There is something wrong here");
			}
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e){
				System.out.println("error caught" +e);
			}	
		}
	}
}
