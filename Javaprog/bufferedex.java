import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bufferedex{
	public static void main(String []args)throws IOException{
		InputStreamReader i= new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(i);

		String name = "";
		while(!name.equals("exit")){
			System.out.print("Enter name: ");
			name = br.readLine();
			System.out.println("Hello " + name);	
		}
		br.close();
		i.close();
	}
}


