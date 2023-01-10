package Practice;

public class Palindrome {

	public static void main(String[] args) {
		int a=545, temp=a, rev=0, rem=0;
		
		while(temp!=0)
		{
			rem=temp%10;
			rev=rev*10+rem;
			temp=temp/10;
		}
		if(a==rev)
		{
		System.out.println(a+" is a reverse num");
		}
		else
		{
		System.out.println(a+" is not a reverse num");
		}
		
		
		

	}

}
