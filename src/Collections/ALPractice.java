package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ALPractice {

	public static void main(String[] args) {
		Integer[] arr=new Integer[] {1,2,3,4,5};
		
		ArrayList<Integer>al1=new ArrayList<>(Arrays.asList(arr));
		al1.add(3);
		al1.add(4);
		al1.add(0,9);
				
		
		System.out.println(al1.size());
		System.out.println(al1.set(3, 8));
		System.out.println(al1);
		/*
		for(int i=0;i<al1.size();i++) {
			System.out.println(al1.get(i));
		}
		*/
		for (Integer integer : al1) {
			System.out.println(integer);
			
		}
	}

}
