package Recursion;

public class check_number {
public static boolean check_num(int input[],int x) {
	if(input.length<=1) {
		if(input[0]==x) {
			return true;
		}else {
			return false;
		}
	}
	if(input[0]==x) {
		return true;
	}
		int smarr[]=new int [input.length-1];
	for(int i=1;i<input.length;i++) {
		smarr[i-1]=input[i];
	}
	boolean b=check_num(smarr,x);
	return b;
	
}
public static void main(String[] args) {
	int arr[]= {9,5,10,8};
	int n=8;
	boolean b=check_num(arr,n);
	System.out.println(b);
}
	
}
