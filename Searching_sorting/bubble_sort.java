package Searching_sorting;
import java.util.*;
public class bubble_sort {
	public static void bubbleSort(int[] arr){
		
		for(int j=1;j<arr.length;j++ ) {
		for(int i=0;i<arr.length-1;i++)
		{
			if(arr[i]>arr[i+1]) {
				int s=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=s;
			}
			
		}}
		for(int element:arr) {
			System.out.println(element);
		}
	}
	public static void main(String []args) {
		int []arr=new int[] {9, 3, 6, 2, 9};
	
		bubbleSort(arr);
	//	System.out.println(re);
	}
}
