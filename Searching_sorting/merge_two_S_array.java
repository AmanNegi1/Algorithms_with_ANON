package Searching_sorting;

public class merge_two_S_array {
public static int[] merge(int arr1[], int arr2[]){
	int len=arr1.length+arr2.length; 
	int []arr=new int[len];
	int min=0,i=0,j=0,k=0;;
	while(i<arr1.length&& j<arr2.length ) {
		
		if (arr1[i]<arr2[j]) {
			arr[k]=arr1[i];
			i++;
			k++;
		}else  {
			arr[k]=arr2[j];
			j++;
			k++;
		}
	}//end of while loop
	while(i<arr1.length) {
		arr[k]=arr1[i];
		i++;
		k++;
		
	}
	while(j<arr2.length) {
		arr[k]=arr2[j];
		j++;
		k++;
		
	}
	return arr;
	}
	
public static void main(String []args) {
	int []arr1=new int[] {2,6,9,15};
	int []arr2=new int[] {1,4,6,7};
	int arr[]=merge(arr1,arr2);
	for(int ele:arr) {
		System.out.println(ele);
	}
//	System.out.println(re);
}
}
