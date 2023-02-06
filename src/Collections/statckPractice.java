package Collections;

import java.util.Stack;

public class statckPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> books=new Stack<>();
		books.add("Red");
		books.add("Black");
		books.add("White");
		
	
		System.out.println(books);
		System.out.println(books.peek());
		System.out.println(books.pop());
		System.out.println(books.push("Yellow"));
		System.out.println(books.search("Red"));
		System.out.println(books.indexOf("Red"));
		System.out.println(books.isEmpty());   //Vector
		System.out.println(books.empty());     //Stack
		
		
		System.out.println(books);

	}

}
