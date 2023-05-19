import java.io.File;
import java.io.IOException;

public class renameFile{
	public static void main(String []args)throws IOException{
		File f = new File("C:\\Users\\Saransh\\Documents\\file1.txt");
		File r = new File("C:\\Users\\Saransh\\Documents\\newname.txt");

		if(f.exists()){
			System.out.println(f.renameTo(r));
		}
		else{
			System.out.println("File does not exist");
		}
	}
}
