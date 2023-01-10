package StringPrograms;

public class StringWithoutReverseFunction {

	public static void main(String[] args) {
		String s="Honesty is the best policy.";
		//StringBuilder sb = new StringBuilder(s);
		
		System.out.println(s.length());
		for(int i=s.length()-1;i>=0;--i)
		{
			System.out.print(s.charAt(i));
		}
		
	}

}
