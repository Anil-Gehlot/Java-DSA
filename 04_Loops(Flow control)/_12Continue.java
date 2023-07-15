



public class _12Continue{
	public static void main(String args[]){
		int num = 8;

		for (int i = 1; i<=num; i++){

			if (i==5){
				System.out.println("Skipped this iteration");
				continue;
			}

			System.out.println(i + " hello");
		}
	}
}