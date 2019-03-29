package Recursion;
import java.util.*;
public class check_sorted {
public static boolean check_sort(int input[]) {
	if(input.length<=1) {
		return true;
	}
	if(input[0]>input[1]) {
		return false;
	}
	int smar[]=new int[input.length-1];
	for(int i=1;i<input.length;i++) {
		smar[i-1]=input[i];
	}
	boolean y=check_sort(smar);
	return y;
}
public static void main(String []args) {
	int arr[]={1,2,1};
	boolean t=check_sort(arr);
	System.out.print(t);
}
}
