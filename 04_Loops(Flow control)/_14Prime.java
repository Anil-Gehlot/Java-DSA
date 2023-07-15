

import java.util.*;


public class _14Prime{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a number: ");
		int num = sc.nextInt();

		boolean isPrime = true;

		for(int i = 2; i<= Math.sqrt(num); i++){
			if (num%i==0){
				isPrime = false;
			}
		}

		if(isPrime==true){
			System.out.println("It is a Prime number....");
		}
		else{
			System.out.println("It is not Prime number....");
		}
		
	}
}