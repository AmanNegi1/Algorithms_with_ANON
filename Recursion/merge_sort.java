package Recursion;

public class merge_sort {
   
	public static void merge(int input[],int si,int ei) {
		   
        }
	public static void merge_sort_pro(int a[],int start,int end) {
		if(start<=end) {
			return ;
		}
		int mid=(start+end)/2;
		if(a[start]>a[mid]) {
		  int t=a[start];
		  a[start]=a[mid];
		  a[mid]=t;
		}
		
		merge_sort_pro(a,start,mid);
		
		merge_sort_pro(a,mid+1,end);
		for(int i=0;i<=mid;i++) {
			System.out.println(a[i]);
		}
	    merge(a,start,end);
        }
	
	public static void merge_sort1(int []input) {
		
		merge_sort_pro(input,0,input.length-1);
		
	}
	public static void main(String args[]) {
		int arr[]= {3,1,7,9,3,0,5};
		merge_sort1(arr);
		 
    }
}
