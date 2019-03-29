package Searching_sorting;
import java.util.*;
public class rotate_array {
public static void rotate(int[] arr, int d) {
	int len=arr.length;
	int []a1=new int[d];
	for(int i=0;i<d;i++) {
	a1[i]=arr[i];  
	}
	int p=0;
		for(int j=0;j<len;j++) {
			
			
			if(j>=len-d) {
				arr[j]=a1[p];
			    p++;
		    }else{
              arr[j]=arr[j+d];
            }
		
		}
		 for (int element: arr) {
	            System.out.println(element);
	        }
	}
	public static void main(String []args) {
		int []arr=new int[] {1 ,2, 3, 4, 5 ,6, 7};
		int n=2;
		rotate(arr,n);
		//System.out.println(re);
	}
}
