

// skip the iteration when user enters multiple of ten.


import java.util.Scanner;

public class _13Continue{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while (true){
			System.out.print("Enter number: ");
			int num = sc.nextInt();
			if (num%10!=0 || num==0){
				System.out.println(num);
			}
			else{
				continue;
			}
		}
	}
}