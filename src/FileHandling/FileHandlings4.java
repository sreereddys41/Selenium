package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;



public class FileHandlings4 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./sample.txt");
		if(!f.exists())
			f.createNewFile();
		
	
		FileReader fr=new FileReader(f);
		BufferedReader br=new BufferedReader(fr);
		
		String line=new String();
		String text=new String();
		while ((text=br.readLine())!=null) {
			line +=text + "\n";
			
			//System.out.println(text);
		}
		System.out.println(line);
		//System.out.println(br.read());
	
	
	}
		

}
