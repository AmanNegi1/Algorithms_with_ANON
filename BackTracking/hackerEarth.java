package BackTracking;
import java.util.*;
public class hackerEarth {

	public static void main(String args[]) {
		int arr[]= {1,2,3};
		int x=findX(arr);
	    System.out.println(x);
	}

	private static int findX(int[] arr) {
		int storage[]=new int[arr.length+1];
		int x=arr[0];
		int diffSum=0;
		for(int j=0;j<arr.length;j++) {
			int t=x-arr[j];
			diffSum+=Math.abs(t);
		}
		storage[0]=diffSum;
		
		diffSum=0;
		for(int j=0;j<arr.length;j++) {
		for(int i=0;i<arr.length;i++ ) {
		   if(storage[j]==0) {
			diffSum+=arr[i];
		   }else {
			  // storage[i]=storage[arr[i]];
			   break;
		   }
		}
		storage[j]=diffSum;
		}
		for(int i=0;i<storage.length;i++) {
			if(storage[i]==0) {
				return arr[i];
			}
		}
		return -1;
	}
}
