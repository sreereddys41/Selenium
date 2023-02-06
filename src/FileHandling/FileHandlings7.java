package FileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileHandlings7 {

	public static void main(String[] args) throws IOException {
		File f=new File("./sample1.txt");
		if(f.exists())
			//f.delete();
		f.createNewFile();
		
		String existingline=new String();
		String line="";
		
		BufferedReader br=new BufferedReader(new FileReader(f));
		
		while((line=br.readLine()) != null)
		
		existingline +=line +"\n";
		
		String s="welcome to srikanth";
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write(existingline+s);
		
		
		bw.flush();
		bw.close();
		
	}
	
		
	}

