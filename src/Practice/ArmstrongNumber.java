package Practice;

//System.out.println("Armstrong number");
public class ArmstrongNumber {
	public static void main(String[] args) {
		int num=153;
		int res=0;
		int temp=num;
		int rem=0;

		while(temp>0)
		{
			rem=temp%10;
			res=res+(rem*rem*rem);
			temp=temp/10;
		}
		if(res==num)
		{
			System.out.println(num+" is Armstrong number");
		}
		else
		{
			System.out.println(num+" is not an Armstrong number");
		}
	}
}
