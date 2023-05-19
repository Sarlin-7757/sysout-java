import java.io.File;
import java.io.IOException;

public class fileInfo {
	public static void main(String[]args)throws IOException{
		File f = new File("C:\\Users\\Saransh\\Documents\\file1.txt");

		if(f.exists()){
			System.out.println("File Name:" + f.getName());
			System.out.println("File Location:" + f.getAbsolutePath());
			System.out.println("File Writable:" + f.canWrite());
			System.out.println("File readable:" + f.canRead());
			System.out.println("File size:" + f.length());	
		}else{
			System.out.println("file does not exist");
		}
	}
}
	
	
	
