package Exception_Handling;

import Loops.forloop;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
		int a=20;
		int b=0;
		int c=a/b;
		System.out.println("the value of c is:"+c);
		}
		catch(Exception error)
		{
			System.out.println("The issue in executing the statement of try block");
			System.out.println("The Error caught on exception is"+error);
		}

	}

}
