import java.applet.Applet;
import java.awt.*;
 /* this is the applet */
public class Myapplet extends Applet{

	Label l1,l2;
	TextField t1 ,t2;
	Button b1;
	
	public void init(){
		l1 = new Label("First Number");
		l2 = new Label("Second Number");

		t1 = new TextField();
		t2 = new TextField();

		b1 = new Button("Add");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b1);
	}

}
