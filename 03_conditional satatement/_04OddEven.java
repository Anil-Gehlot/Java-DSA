



import java.util.Scanner;


public class _04OddEven{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);


		System.out.print("Enter number: ");
		int num1 = sc.nextInt();

		if (num1%2==0){
			System.out.println("Number is Even.");
		}
		else{
			System.out.println("Number is Odd.");
		}
	}

}