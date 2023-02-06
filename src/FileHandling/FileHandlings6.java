package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileHandlings6 {

	public static void main(String[] args) throws IOException {
		File f=new File("./sample1.txt");
		if(f.exists())
			//f.delete();
		f.createNewFile();
		String s="hello world";
		
		FileWriter fw=new FileWriter(f);
		//fw.write(s);
		fw.write(s.toCharArray());
		
		fw.flush();
		fw.close();
		
	}
	
		
	}

