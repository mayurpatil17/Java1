package Practice;

public class FibonacciNumber {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		int fib=0;
		int count=10;
		
		for(int i=0;i<count;i++)
		{
			fib=a+b;
			System.out.println(fib);
			a=b;
			b=fib;
		}

	}

}
