
import java.util.Scanner;

public class _09Prime{
	public static boolean isprime(int n){
		boolean prime = true;
		for(int i=2; i<=n-1; i++){
			if (n%i==0){
				prime = false;
			}
		}
		return prime;
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int a = sc.nextInt();

		System.out.println(isprime(a));


	}
}