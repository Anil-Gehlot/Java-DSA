




import java.util.Scanner;

public class _04Pattern{

	public static void floyd(int row){

		int sum = 1;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){
				System.out.print(sum + " ");
				sum++;
			}
			System.out.println();
		}
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();


		floyd(row);
	}
}