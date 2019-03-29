package Recursion;

public class sum_of_array {
public static int  sum_array(int input[]) {
	
	if(input.length<=1) {
		return input[0];
	}
	
	int sarr[]=new int[input.length-1];
	for(int i=1;i<input.length;i++) {
		sarr[i-1]=input[i];
	}
	int ans=input[0]+sum_array(sarr);
    return ans;
}
public static void main(String []args) {
	int arr[]= {1,2,3,4};
	int s=sum_array(arr);
	System.out.println(s);
}
}
