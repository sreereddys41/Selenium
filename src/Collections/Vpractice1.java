package Collections;

import java.util.Arrays;
import java.util.Vector;

public class Vpractice1 {

	public static void main(String[] args) {
		Object[] arr=new Object[] {1,5,7,8,9};
		Vector v1=new Vector(Arrays.asList(arr));
		
		System.out.println(v1);
		System.out.println(v1.size());
		System.out.println(v1.capacity());

	}

}
