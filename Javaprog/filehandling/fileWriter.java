import java.io.FileWriter;
import java.io.IOException;

public class fileWriter{
	public static void main(String[]args){
		try{
			FileWriter f = new FileWriter("C:\\Users\\Saransh\\Documents\\file1.txt");
			try{
				f.write("Java programming file handling ");
			}finally{
				f.close();
			}
			System.out.println("Successfully written into the file");
		}catch(IOException i){
			System.out.println(i);
		}
	}
}
