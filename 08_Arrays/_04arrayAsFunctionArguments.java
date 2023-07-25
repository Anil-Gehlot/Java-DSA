


import java.util.Scanner;

public class _04arrayAsFunctionArguments{

	public static void update(int a[], int num){

		num = num +10;

		for(int i=0; i<a.length; i++){
			a[i] = a[i] + 1;
		}
	}


	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		// supports call by value....
		int num = 5;

		// supports call by reference.....
		int marks[] = {97, 98, 99};

		update(marks, num);

		System.out.println(num);

		for(int i=0; i<marks.length; i++){
			System.out.println(marks[i]);
		}
		System.out.println();
	}
}