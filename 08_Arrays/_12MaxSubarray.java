

//  optimized solution then brut force method.....


// 	prefix sum method   
//	prefix[end]-prefix[start-1] 
// // time complexity O(n^2)



public class _12MaxSubarray{

	public static void maxSubarraySum(int numbers[]){
		int currSum = 0;
		int maxSum = Integer.MIN_VALUE;
		int prefix[] = new int[numbers.length];

		prefix[0] = numbers[0];

		// calculate prefix array
		for(int i=1; i<prefix.length; i++){
			prefix[i] = prefix[i-1] + numbers[i];
		}


		for(int i=0; i<numbers.length; i++){

			for(int j=i; j<numbers.length; j++){

				currSum = i == 0 ? prefix[j] : prefix[j] - prefix[i-1];

				if(maxSum<currSum){
					maxSum = currSum;
				}
			}
			
		}
		System.out.println("max sum: "+maxSum);

	}


	public static void main(String args[]){
		int arr[] = {1, -2, 6, -1, 3};

		maxSubarraySum(arr);


	}
}