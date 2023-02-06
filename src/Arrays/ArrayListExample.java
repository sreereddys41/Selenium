package Arrays;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List <Object>array1=new ArrayList<>();
		array1.add(10);
		array1.add("selenium");
		array1.add("Testing Job");
		array1.add(21.12);
		
		for(int i=0;i<array1.size();i++)
		{
			System.out.println(array1.get(i));
		}

	}

}
