


public class _08reverseArray{

	public static void Reverse(int arr[]){

		int start = 0;
		int end = arr.length-1;

		while(start<end){

			int temp = arr[start];

			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void main(String args[]){

		int arr[] = {2, 4, 6, 8, 10};

		Reverse(arr);

		for(int x : arr){
			System.out.print(x + " ");
		}
	}

}


//  time complexity :  O(N)  