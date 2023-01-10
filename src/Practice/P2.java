package Practice;

public class P2 {

	public static void main(String[] args) {
		int n = 20;
		
		for (int i = 2; i <= n; i++) {
			int count = 0;                            //count should be used here only
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(i);
			}

		}	
	}

}
