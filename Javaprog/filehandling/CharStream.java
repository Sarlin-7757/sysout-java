import java.io.*;
import java.util.*;


public class CharStream{

	public void WriteData()throws IOException{
		String input;
		try{
			FileWriter fw = new FileWriter("");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the input");
			input = sc.nextLine();

			fw.write(input);
			fw.close();
			System.out.println("Successfully written");
		}
		catch(IOException e){
			System.out.println(e);
		}
	}
	public void ReadData()throws IOException{
		try{	
			FileReader fr = new FileReader("");
			int ch;
				while((ch = fr.read())!= -1)
					{ System.out.println((char)ch); 
				}
			}
		catch(IOException e){
		System.out.println(e);
	}
	}
	
	public static void main(String []args)throws IOException{
		CharStream c = new CharStream();
		c.WriteData();
		c.ReadData();
	}
}
		


