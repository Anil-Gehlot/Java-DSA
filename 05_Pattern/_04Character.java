





import java.util.Scanner;

public class _04Character{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of rows for character pattern: ");
		int num = sc.nextInt();

		// char c = 65;
		char c = 'A';

		for(int i=1; i<=num; i++){
			for (int j=1 ; j<=i; j++){

				System.out.print(c);
				// c=(char)(c+1);
				c++;
			}
			System.out.println();
		}	
		



	}
}