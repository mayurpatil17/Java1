package arraysProgram;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
		int[] arr1= new int[]{3,4,5,7,8};
		int[] arr2= new int[arr1.length];
		
		for(int i=0;i<arr1.length;i++)
		{
			arr2[i]=arr2[i]+arr1[i];
			System.out.println(arr2[i]);
		}
	}

}
