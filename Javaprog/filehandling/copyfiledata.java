import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class copyfiledata{
	public static void main(String []args)throws IOException{
		FileInputStream r = new FileInputStream("C:\\Users\\Saransh\\Documents\\newname.txt");
		FileOutputStream w = new FileOutputStream("C:\\Users\\Saransh\\Documents\\copiedfile.txt");

		int i;
		while((i=r.read())!= -1){
			w.write((char)i);
		}
		System.out.println("File copied Successfully");
		r.close();
		w.close();
	}
}


