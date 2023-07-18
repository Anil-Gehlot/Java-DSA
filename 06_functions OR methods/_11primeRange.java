

import java.util.Scanner;

public class _11primeRange{

	public static void isprime(int n){

		
		
		for(int i=1; i<=n; i++){
			for(int j = 2; j<i; j++){
				if (i%j!=0){
					System.out.print(i +", ");
				}
				break;
				
			}
		}
	}
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter range number: ");
		int a = sc.nextInt();

		isprime(a);
	}
}

