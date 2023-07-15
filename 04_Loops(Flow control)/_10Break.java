

public class _10Break{
	public static void main(String args[]){
		int num = 8;

		for (int i = 1; i<=num; i++){

			if (i==5){
				System.out.println("Breaking the loop");
				break;
			}

			System.out.println(i + " hello");
		}
	}
}