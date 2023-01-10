package StringPrograms;

//Java Program to count the total number of vowels and consonants in a string
public class VowelsAndConsonantsInString {

	public static void main(String[] args) {
		String  s="Mayur Patil";
	    //s= s.toLowerCase();    //if we have to reduce comparison
		
		int vowels=0;
		int consonants=0;
		for(int i=0;i< s.length();i++)
		{
			
		
			if( s.charAt(i)=='a'||  s.charAt(i)=='e'||  s.charAt(i)=='i'||  s.charAt(i)=='o'||  s.charAt(i)=='u'||
			 s.charAt(i)=='A'||  s.charAt(i)=='E'||  s.charAt(i)=='I'||  s.charAt(i)=='O'||  s.charAt(i)=='U') 
			{
				vowels=vowels+1;
			}
			else
			{
				consonants=consonants+1;
			}
			
		}
		System.out.println("Vowels = "+vowels);
		System.out.println("Consonants = "+consonants);
		

	}

}
