interface Drawable{
	void draw();

	default void msg(){
		System.out.println("This is a random message");
	}
}


class Rectangle implements Drawable{
	public void draw(){
		System.out.println("we are drawing");
	}
}

public class TestDefault{
	public static void main(String [] args){
		Drawable d = new Rectangle();
		d.draw();
		d.msg();
	}
}
