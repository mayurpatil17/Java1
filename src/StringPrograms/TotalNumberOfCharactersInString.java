package StringPrograms;

//Java Program to count the total number of characters in a string?
public class TotalNumberOfCharactersInString {

	public static void main(String[] args) {
		String s="Mayur Patil";        //5+5=10
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
			{
			count++;
			}
		}
		System.out.println(count);
	}

}
