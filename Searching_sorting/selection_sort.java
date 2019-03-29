package Searching_sorting;

public class selection_sort {
	public static void  Selection_sort(int []arr) {
		for(int i=0;i<arr.length-1;i++) {
			int min =arr[i];
			int minIndex=i;
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
					minIndex=j;
				}
			}//end of inner for loop..
			if(minIndex!=i) {
			arr[minIndex]=arr[i];
			arr[i]=min;
			}
		}//end of outer for loop
		for(int elment:arr) {
			System.out.print(" "+ elment);
		}
	}
	public static void main(String []args) {
		int []arr=new int[] {7 ,2, 1, 4, 2 ,0, 7};
	
		Selection_sort(arr);
		//System.out.println(re);
	}
}
