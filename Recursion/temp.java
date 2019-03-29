package Recursion;

public class temp {

	public static int [][] function(int input[],int n){
		if(n == input.length){
		      int[][] temp = new int[1][0]; ///when first element is null
		      return temp;
		    }
		    //taking small ans
		
		    int[][] smallAns = function(input, n+1);//calling recursion

		System.out.println(smallAns.length);
		return tem;
	}
	public static void main(String args[]) {
		int arr[]= {1,2,3};
		int a[][]=function(arr,0);
	}
}
