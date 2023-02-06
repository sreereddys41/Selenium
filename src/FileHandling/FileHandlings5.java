package FileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class FileHandlings5 {

	public static void main(String[] args) throws IOException {
		File f=new File("./sample1.txt");
		if(f.exists())
			f.delete();
		f.createNewFile();
		String s="hello";
		
		FileOutputStream fos=new FileOutputStream(f);
		
		for(char ch:s.toCharArray())
		{
			fos.write((int)ch);
		}
		//fos.write(75);
		//fos.write(69);
		
	}
	
		
	}

