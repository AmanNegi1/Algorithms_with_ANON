package java_prctice;
import java.util.*;
public class highestSum {

	public static void findHighSum(int ar[]) {
		int sum=0;
		int maxSum=0;
		for(int i=0;i<ar.length;i++) {
			for(int j=i+1;j<ar.length;j++) {
				sum=ar[i]+ar[j];
				if(sum>maxSum) {
				maxSum=sum;
				}
			}
		}
		System.out.println(maxSum);
	}
	
	public static void main(String args[]) {
		int arr[]= {4,6,3,6,8};
		findHighSum(arr);
	}
}
