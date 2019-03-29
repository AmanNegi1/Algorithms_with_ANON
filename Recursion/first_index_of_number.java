package Recursion;

public class first_index_of_number {
	public static int firstIndexBetter(int input[],int n,int startIndex) {
		if(startIndex==0) {
			if(input[startIndex]==n) 
				return startIndex;
			else 
				return -1;
			
		}
	
		
		if(input[startIndex]==n) {
		return startIndex;
////		
		}
		int ans=firstIndexBetter(input,n,startIndex-1);
		return ans;
	}
//	public static int firstIndex(int input[], int x) {
//		
//	int i=firstIndexBetter(input,x,0);
//		
//		return i;
//	} 
	public static void main(String []args) {
	int arr[]= {9, 10,8 ,87,9,8,7};
	int nn=8;
	int r=firstIndexBetter(arr,nn,arr.length-1);
	System.out.println(r);
	}
}
