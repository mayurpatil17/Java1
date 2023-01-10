package Practice;

public class SquareRoot {

	public static void main(String[] args) {
		int n=36;
		int sqrt=0;
		
		for(int i=2;i<n/2+1;i++)
		{
			if(n/i==i)
			{
				System.out.println(i+ " is square root of "+n);
			}
		}

	}

}
