


public class _05linearSearch{


	public static int linear_Search(int number[], int key){

		for(int i=0; i<number.length; i++){
			if(number[i] == key){
				return i;
			}
		}
		return -1;
	}

	public static void main(String args[]){

		int marks[] = {2, 4, 6, 8, 10, 12, 14, 16};
		int key = 20;

		int index = linear_Search(marks, key);

		if(index== -1){
			System.out.println("Not Found");
		}		

		else{
			System.out.println("key found at index: " + index);
		}



	}
}