package Collections;

import java.util.Arrays;
import java.util.Vector;

public class VPractice {

	public static void main(String[] args) {
		Vector v1=new Vector();
		v1.add("Srikanth");
		v1.add("Sudheer");
		v1.add(0,"Karthik");
		v1.add("Aarush");
		v1.add("Srikara");
		v1.add("a1");
		v1.add("a2");
		v1.add("a3");
		v1.add("a4");
		v1.add("a5");
		
		Vector v2=new Vector();
		v2.add("Ramesh");
		v2.add("Suresh");

		Vector v3=new Vector();
		v2.add("Suresh");
		v2.add("Ramesh");
		
		System.out.println(v1);
		/*
		for(int i=0;i<v2.size();i++) {
			v1.add(v2.get(i));
		}
		*/
		//v1.addAll(0,v2);
		v1.addAll(v2);
		//v1.remove("Aarush");
		//v1.removeAll(v2);
		//v1.clear();
//		v1.set(1, "reddy");
//		System.out.println(v1);
//		System.out.println(v1.get(2));
//		
//		System.out.println(v1.size()); 
//		System.out.println(v1.capacity());
//		System.out.println(v1.containsAll(v3));
//		System.out.println(v1.indexOf("Aarush"));
//		System.out.println(v1.firstElement());
//		System.out.println(v1.lastElement());
		Object[] arr=v1.toArray();
		System.out.println(Arrays.toString(arr));
}
	

}
