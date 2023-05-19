import java.io.File;
import java.io.IOException;

public class filecreate{
	public static void main(String []args) throws IOException{
		File f = new File("C:\\Users\\Saransh\\Documents\\file1.txt");
		if(f.createNewFile()){
			System.out.println("file is created");
		}
		else{
			System.out.println("File already exists");
		}
	}
}
