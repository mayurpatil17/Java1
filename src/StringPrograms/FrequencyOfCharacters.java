package StringPrograms;

public class FrequencyOfCharacters {
	public static void main(String[] args) {
		String s="Picture Perfect";
		s=s.toLowerCase();
		
		for(char ch='a';ch<='z';ch++)
		{
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(s.charAt(i)==ch)
				{
					count++;
				}
			}
			if(count!=0)
			System.out.println(ch+"="+count);
			
		}
	
	}
}
