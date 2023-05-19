interface Runnable{
	public String run(int speed , int distance);
}

public class lambdapro{
	public static void main(String[] args){
		Runnable r = (speed,distance) ->("Distance is " +distance + " speed is " +speed );	

		String r15 = r.run(10,150);
		System.out.println(r15);

	Runnable r1 = (int speed , int distance) ->{
		return ("Distance is" +distance + " speed is " + speed );
	};
	String fz = r1.run(100,150);
	System.out.println(fz);
	}
}
	



