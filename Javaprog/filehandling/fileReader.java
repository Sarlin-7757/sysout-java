import java.io.FileReader;
import java.io.IOException;

public class fileReader{
	public static void main(String[]args){
		try{
			FileReader fr = new FileReader("C:\\Users\\Saransh\\Documents\\file1.txt");
			try{
				int i;
				while((i =fr.read())!=-1){
					System.out.println((char)i);
				}
			}
			finally{
				fr.close();
			}
		}
		catch(IOException i ){
			System.out.println(i);
		}
	}
}
	
	

