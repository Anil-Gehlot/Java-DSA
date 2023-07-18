

import java.util.Scanner;

public class _06BinomialCoffiecient{

	public static int fact(int a){
		int ans = 1;
		for(int i=1; i<=a; i++){
			ans = ans*i;
		}
		return ans;
	}

	public static int BinomialCoffiecient(int n, int r){
		int n_fact = fact(n);
		int r_fact = fact(r);
		int nmr_fact = fact(n-r);

		int bc = n_fact/(r_fact*nmr_fact);
		return bc;
	}

	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter n: ");
		int n = sc.nextInt();

		System.out.print("Enter r: ");
		int r = sc.nextInt();

		
		int finall = BinomialCoffiecient(n,r);
		System.out.println("Binomial Coffiecient: " +finall);

	}
}