public class Multithreading{
	public static void main(String [] args){
		for(int i=1 ; i<=3;i++){
		Multithreadingthing mything = new Multithreadingthing(i);
		mything.start();
		}
	}
}




// Multithreadingthing mything2 = new Multithreadingthing();
		// mything.start();
		// mything2.start();

