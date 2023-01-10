package StringPrograms;

public class PalindromeString {

	public static void main(String[] args) {
		String s="mayam";
		s=s.toLowerCase();
		boolean flag=true;

		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=s.charAt(s.length()-1-i))
			{
				flag=false;
				break;
			}
		}

		if(flag)
		{
			System.out.println("String is palindrome");
		}

		else
		{
			System.out.println("String is not palindrome");
		}
	}

}
