

// 01 01 01 triangle pattern.......

/*

1
0 1
0 1 0
1 0 1 0
1 0 1 0 1
0 1 0 1 0 1

*/



import java.util.Scanner;

public class _05Pattern{


	public static void pattern(int row){

		int sum = 1;

		for(int i=1; i<=row; i++){

			for(int j=1; j<=i; j++){
				System.out.print(sum + " ");

				if(sum==1){
					sum = 0;
				}
				else{
					sum = 1;
				}
			}
			System.out.println();
		}
	}






	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter no. of rows: ");
		int row = sc.nextInt();

		pattern(row);

	}
}