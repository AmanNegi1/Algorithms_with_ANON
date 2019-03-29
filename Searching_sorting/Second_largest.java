package Searching_sorting;

public class Second_largest {
public static int secondLargestElement(int[] arr) {
	int max=arr[0];
    int secMax=Integer.MIN_VALUE;
for(int i=1;i<arr.length;i++){
  if(max<arr[i])
    max=arr[i];
}
for(int j=0;j<arr.length;j++) {
		if(arr[j]>secMax && arr[j]<max) 
			secMax=arr[j];
		}
  return secMax;
	}
	public static void main(String []args) {
		int []arr=new int[] {9, 3, 6, 2, 9};
	
		int re=secondLargestElement(arr);
		System.out.println(re);
	}
}
