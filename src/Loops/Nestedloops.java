package Loops;

public class Nestedloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
		
			System.out.println();
		}
		for(int x=3;x>=1;x--)
		{
			for(int y=1;y<=x;y++)
				System.out.print(y+" ");
			System.out.println();
		}
	}

}
