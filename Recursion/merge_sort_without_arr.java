package Recursion;

public class merge_sort_without_arr {

	public static void merge_sort(int ar[],int sI,int eI) {
		if(sI>=eI) {
			return ;
		}
		int mid=(sI+eI)/2;
		merge_sort(ar,sI,mid);
		merge_sort(ar,mid+1,eI);
		merge(ar,sI,eI);
	}
	public static void merge(int input[],int sI,int eI) {
		int mid=(sI+eI)/2;
		int i=sI;
		int j=mid+1;
		int k=0;
		int ans[]=new int[eI-sI+1];
		while(i<=mid && j<=eI) {
			if(input[i]>input[j]) {
				ans[k]=input[i];
				i++;
				k++;
			}else {
				ans[k]=input[j];
				j++;
				k++;
			}
		}//end of while loop..
		while(i<=mid) {
			ans[k]=input[i];
			i++;
			k++;
		}
		while(j<=eI) {
			ans[k]=input[j];
			j++;
			k++;
		}
		for(int p=0;p<ans.length;p++) {
			input[sI+p]=ans[p];
		}
	}
	public static<T> void main(String args[]) {
		int arr[]= {8,1,2,3,5,7,9,1};
		merge_sort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
