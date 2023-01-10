package StringPrograms;

public class StringRotation    
{    
    public static void main(String[] args) {    
        String a = "avajava", b = "javaava";    
            
        String c=a+a;
        System.out.println(c);
        if(c.contains(b))
        {
        	System.out.println("String are rotation of each other");
        }
        else
        {
        	System.out.println("String are not rotation of each other");
        }
    }    
}   
