

import java.io.IOException;

class printTable{
	void showTable(int x)throws InterruptedException{
		for(int i = 1 ; i<=10 ; i++){
			System.out.println(x*i);	
			Thread.sleep(400);
		}
	}
}

class Thread1 extends Thread{
	printTable t;
	Thread1(printTable t){
		this.t = t;
	}
	public void run(){
		t.showTable(2);
	}
}

class Thread2 extends Thread{
	printTable t;
	Thread2(printTable t){
		this.t = t; 
	}
	public void run(){
		t.showTable(5);
	}
}



public class syncMethod{
	public static void main(String []args){
		printTable obj = new printTable();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		t1.start();
		t2.start();
	}
}
