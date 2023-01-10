package StringPrograms;

public class CountWords {

	public static void main(String[] args) {
		String string="Java is a programming language  ";
		
		int count=0;
		char ch[]= new char[string.length()];
		System.out.println(string.length());
        for(int i=0;i<string.length();i++)  
        {  
            ch[i]= string.charAt(i);  
            if( ((i>0)&&(ch[i]!=' ')&&(ch[i-1]==' ')) || ((ch[0]!=' ')&&(i==0)))  
                count++;  
        }
        
		System.out.println(count);
	}

}
