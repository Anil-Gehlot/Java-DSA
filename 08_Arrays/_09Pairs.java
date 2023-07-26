


// Time complexity    O(n^2)

//  formula to find the total no. of pairs= [n(n-1)]/2

public class _09Pairs{

	public static void getPairs(int arr[]){

		int total = 0;

		for (int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){

				System.out.print("(" +arr[i] +","+arr[j]+")");
				total++;
			}
			System.out.println();
		}
		System.out.println("Total number of pairs: "+ total);
	}	


	public static void main(String args[]){

		int arr[] = {2, 4, 6, 8, 10};

		getPairs(arr);

	}
}