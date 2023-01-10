package numberPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		int n = 20;
		for (int i=2; i<=n; i++) 
		{
			int flag = 0;
			for (int j=2; j<(i/2+1);j++)
			{
				if (i%j==0) 
				{
					flag++;
					break;
				}
			}
			if (flag == 0) 
			{
				System.out.println(i);
			}
		}
	}
}
