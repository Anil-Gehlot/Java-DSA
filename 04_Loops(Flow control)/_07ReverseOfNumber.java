

import java.util.Scanner;

public class _07ReverseOfNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number to reverse: ");
		int num = sc.nextInt();

		while (num>0){
			int remain = num%10;
			num = num/10;
			System.out.print(remain);
			

		}
		System.out.println();
	}
}