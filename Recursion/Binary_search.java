package Recursion;

public class Binary_search {

	public static int binary_Search(int input[],int f) {
		
		if(input.length-1<=0) {
			return -1;
		}
		int mid=(input.length-1)/2;
		int j=0;
		
		int arr1[]= {};
		if(f<input[mid]) {
			
			arr1=new int[mid];
			for(int i=0;i<mid;i++) {
				arr1[i]=input[i];
			}
		}else if(f>input[mid]) {
			
			arr1=new int[input.length-mid];
			for(int i=mid;i<input.length;i++) {
				arr1[j]=input[i];
				j++;
			}
		}else {
			return mid;
		}
		
		int t= binary_Search(arr1,f);
      return t;
	}
	public static void main(String []args) {
		int arr[]= {1,2,3,6,9,11,12,13};
		int f=13;
		int r=binary_Search(arr,f);
		System.out.println(r);
	}
}
