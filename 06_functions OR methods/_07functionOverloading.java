
// function overloading using parameter.....

public class _07functionOverloading{


	public static int sum(int a, int b){
			return a+b;
		}

	public static int sum(int a, int b, int c){
		return a+b+c;
	}


	/*
	//	error: method sum(int,int) is already defined 

	public static float sum(int v, int w){
		return v+w;
	}
	*/

	public static void main(String args[]){

		int x = 10;
		int y= 20;
		int z = 30;

		System.out.println(sum(x, y));	// 30

		System.out.println(sum(x, y, z));	// 60
		
	}
}