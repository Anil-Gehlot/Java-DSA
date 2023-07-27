



//  Brute force method to find max subarray sum....
// // time complexity O(n^3)


public class _11MaxSubarray{

	public static void maxSubarraySum(int arr[]){

		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;

		for(int i=0; i<arr.length; i++){

			for(int j=i; j<arr.length; j++){

				currSum = 0;

				for(int k=i; k<=j; k++){

					currSum += arr[k];
				}
				
				System.out.println(currSum);
				if(maxSum<currSum){
					maxSum = currSum;
				}
			}
			
		}
		System.out.println("max sum: "+maxSum);

		
	}	


	public static void main(String args[]){

		int arr[] = {2, 4, 6, 8, 10};

		maxSubarraySum(arr);

	}
}