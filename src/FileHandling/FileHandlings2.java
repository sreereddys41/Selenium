package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;



public class FileHandlings2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File f=new File("./sample.txt");
		if(!f.exists())
			f.createNewFile();
		
		Scanner scanner=new Scanner(f);
		
		String text=new String();
		while(scanner.hasNextLine()) {
			text +=scanner.nextLine() +"\n";
			
		}
		System.out.println(text);
		//System.out.println(sc);
		}

}
