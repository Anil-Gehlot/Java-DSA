
// break loop if num is num is multiple of 10.


import java.util.Scanner;

public class _11Sample{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		while (true){
			System.out.print("Enter number: ");
			int num = sc.nextInt();
			if (num%10!=0 || num==0){
				System.out.println(num);
			}
			else{
				System.out.println("it is multiple of 10.");
				break;
			}
		}
	}
}