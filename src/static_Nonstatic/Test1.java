package static_Nonstatic;

import java.util.Random;

public class Test1 {
	
	static int number;
	public static void main(String[] args) {
		
		number=new Random().nextInt();
		
		
		System.out.println(Test1.number);
		
	}
	
	public static void print()
	
	{
		System.out.println("Static Method");
	}

	public void print3()
	{
		System.out.println("non static method");
	}
}
 