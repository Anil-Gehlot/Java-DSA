

import java.util.Scanner;

public class _08ReverseGivenNumber{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter your number: ");
		int num = sc.nextInt();

		int rev = 0;

		while(num>0){
			int last_digit = num%10;

			rev = (rev*10) + last_digit;

			num= num/10;

		}
		System.out.println(rev);
	}
}