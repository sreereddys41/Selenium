package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileHandlings {

	public static void main(String[] args) throws IOException {
		File f=new File("./sample.txt");
		//System.out.println(f.createNewFile());
		//System.out.println(f.delete());
		
		//System.out.println(Arrays.toString(f.listFiles()));
		
		//System.out.println(f.getAbsoluteFile());
		//System.out.println(f.delete());
		FileInputStream fis=new FileInputStream(f);
		int ascii;
		String text=new String();
		while((ascii=fis.read())!=-1) {
		
			text +=String.valueOf((char)ascii);
		//System.out.print((char)ascii);
	}
	
		System.out.println(text);
		fis.close();
	}
}
