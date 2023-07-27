





// //  to find the total no. of subarray     formula:(n(n+1))/2
// // time complexity O(n^3)

public class _10Subarray{

	public static void printSubarray(int arr[]){

		int count = 0;

		for(int i=0; i<arr.length; i++){

			for(int j=i; j<arr.length; j++){

				for(int k=i; k<=j; k++){

					System.out.print(arr[k]+" ");
				}
				count++;
				System.out.println();
			}
			System.out.println();
		}
		System.out.println("Total no. of subarray: "+count);

		
	}	


	public static void main(String args[]){

		int arr[] = {2, 4, 6, 8, 10};

		printSubarray(arr);

	}
}

//--------------------------------------------------------------------------------------------------------


//     find subarray with sum of all subarray and value of largest and smallest value of sum..

// public class _10Subarray{

// 	public static void getLargest(int number[]){
// 		int largest = Integer.MIN_VALUE;  // -infinity
// 		int smallest = Integer.MAX_VALUE;

// 		for(int i=0; i<number.length; i++){

// 			if(largest<number[i]){
// 				largest = number[i];
// 			}

// 			if(smallest > number[i]){
// 				smallest = number[i];
// 			}
// 		}
// 		System.out.println("smallest value is : "  + smallest);
// 		System.out.println("largest value is : "  + largest);
		
// 	}


// 	public static void printSubarray(int arr[]){

// 		int count = 0;

// 		int len = ( arr.length *( arr.length+1))/2;

// 		int total[] = new int[len];

// 		for(int i=0; i<arr.length; i++){

// 			for(int j=i; j<arr.length; j++){

// 				int sum = 0;

// 				for(int k=i; k<=j; k++){

// 					sum = sum+arr[k];

// 					System.out.print(arr[k]+" ");
// 				}
// 				total[count] = sum;
// 				count++;
// 				System.out.println();
// 			}
// 			System.out.println();
// 		}
// 		System.out.println("Total no. of subarray: "+count);


// 		for(int x:total){
// 			System.out.print(x + " ");
// 		}
// 		System.out.println();


// 		getLargest(total);
		
// 	}	


// 	public static void main(String args[]){

// 		// int arr[] = {2, 4, 6, 8, 10};
// 		int arr[] = {1, -2, 6, -1, 3};

// 		printSubarray(arr);

// 	}
// }



