
// function overloading using datatype.....

public class _08functionOverloading{


	public static int sum(int a, int b){
			return a+b;
		}


	public static float sum(float a, float b){
		return a+b;
	}


	public static void main(String args[]){


		System.out.println(sum(10, 20));	// 30

		System.out.println(sum(23.4f, 3.4f));	// 26.8

		
	}
}