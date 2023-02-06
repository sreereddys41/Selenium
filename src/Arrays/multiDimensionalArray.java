package Arrays;

public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String array1[][]=new String[2][2];
		array1[0][0]="selenium";
		array1[0][1]="Learning";
		array1[1][0]="95";
		array1[1][1]="Livetech";
		
		for(int i=0;i<=1;i++)
		{
			for(int j=0;j<=1;j++)
				
				System.out.println(array1[i][j]);
		}

	}

}
