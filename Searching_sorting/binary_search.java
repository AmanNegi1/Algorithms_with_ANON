package Searching_sorting;
import java.util.*;
public class binary_search {
	public static boolean binaryS(int arr[],int k,int s,int e) {
		if(s>e) {
			return false;
		}
		int mid=(s+e)/2;
		if(arr[mid]==k) {
			return true;
		}else if (k>arr[mid]) {
			return binaryS(arr,k,mid+1,e);
		}else if(k<arr[mid]){
			return binaryS(arr,k,0,mid);
		}else {
			return false;
		}
		
	}
	public static void main(String []args) {
		int []arr=new int[] {8, 2, 3,4 ,5 ,6  };
		int n=3;
		boolean  r=binaryS(arr,n,0,arr.length-1);
		System.out.println(r);
	}
}
