package Practice;

public class LargestElementInArray {

	public static void main(String[] args) {
		int[] arr=new int[] {85,25,33,405,51};
		
		int max=arr[0];
		
		for(int i=1;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}

		System.out.println("Largest number of an array is = " +max);
	}

}
