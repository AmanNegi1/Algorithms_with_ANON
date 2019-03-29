package Recursion;

public class binary_search_better {

	public static int binary_better(int a[],int start,int end,int target) {
		int middle=(start+end)/2;
		if(end<start) {
			return -1;
		}
		
		if(target==a[middle]) {
	        return middle;
	    } else if(target<a[middle]) {
	        return binary_better(a, start, middle - 1, target);
	    } else {
	        return binary_better(a, middle + 1, end, target);
	    }
		
	}
	public static void main(String []args) {
		int a[]= {2, 3, 4 ,5,6 ,8};
		int f=3;
		int i=binary_better(a,0,a.length-1,f);
		System.out.println(i);
	}
}
