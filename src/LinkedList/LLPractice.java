package LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;

public class LLPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al=new ArrayList<>();
		al.add("S1");
		al.add("S2");
		
		
		LinkedList<String>ll=new LinkedList<>();
		ll.add("Y1");
		ll.add("Y2");
		ll.add("Y3");
		ll.addAll(0,al);
	//	ll.clear();
	//	ll.remove("Y2");
	//	ll.removeAll(al);
		System.out.println(ll);
		System.out.println(ll.get(3));
		System.out.println(ll.contains("Y3"));
		System.out.println(ll.set(0, "SS"));
		System.out.println(ll);
		for (String s : ll) {
			System.out.println(s);
			
		}
		
		

	}

}
