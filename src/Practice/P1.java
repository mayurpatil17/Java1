package Practice;

public class P1 {

	public static void main(String[] args) {
		int n=13;
		int count=0;
		
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		
		if(count==0)
		{
			System.out.println(n+" is a prime number");
		}
		
		else
		{
			System.out.println(n+ " Not a prime number");
		}

	}

}
