package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class FileHandlings3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./sample.txt");
		if(!f.exists())
			f.createNewFile();
		
	
		FileReader fr=new FileReader(f);
		int ascii;
		String text=new String();
		while((ascii=fr.read())!=-1) {
			text +=String.valueOf((char)ascii);
			
		}
		System.out.println(text);
		//System.out.println(sc);
		}

}
