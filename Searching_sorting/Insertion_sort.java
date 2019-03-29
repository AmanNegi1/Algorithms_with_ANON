package Searching_sorting;

public class Insertion_sort {
	public static void insertionSort(int[] arr){
	for(int i=1;i<arr.length-1;i++) {
		int j=i;
		int v=arr[i];
		while(j>=1 && arr[j-1]>v ) {
			arr[j]=arr[j-1];
			j--;
		}
		arr[j]=v;
	}
	for(int element:arr) {
		System.out.println(element);
	}
	}
	public static void main(String []args) {
		int []arr=new int[] {2 ,13 ,4 ,1 ,3 ,6 ,28};
	
		insertionSort(arr);
	//	System.out.println(re);
	}
}
