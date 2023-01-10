package arraysProgram;

class RotateLeft {  
    public static void main(String[] args) {  
        //Initialize array  
        int [] arr = new int [] {1, 2, 3,4,5}; 
        int r=3;
        int limit=arr.length;
        
        
        while(limit!=0)
        {
        	System.out.println(arr[r++]);
        	if(r==arr.length)
        		r=0;
        	limit--;
        	
        }
       
    }  
}  
