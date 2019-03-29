package Searching_sorting;
//import java.util.*;
public class check_Array_rotation {

	public static int arrayRotateCheck(int[] arr){
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				System.out.println(i);
				return i;
			//	break;
			}
		}
		return -1;
   
	}
	
	public static void main(String []args) {
		int []arr=new int[] {5 ,6 ,1 ,2 ,3 ,4 };
		int r= arrayRotateCheck(arr);
		System.out.println(r);
	}
	
	//System.out.println(r);
}
