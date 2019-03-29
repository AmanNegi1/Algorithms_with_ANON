package java_prctice;
import java.util.*;
public class Sort_array {
	public static void sortBinaryArray(int[] arr){
		int i,j,v;
	      for(i=1;i<=arr.length-1;i++){
	        v=arr[i];
	        j=i;
	        while(arr[j-1]>v && j>=1){
	          arr[j]=arr[j-1];
	          j--;
	          if(j==0) {
	        	  break;
	          }
	        }
	        arr[j]=v;
	      }
	      for (int element: arr) {
	            System.out.println(element);
	        }
		}
	public static void main(String []args) {
		int []arr=new int[] {8, 2, 3,4 ,5 ,6  };
		
		sortBinaryArray(arr);
		//System.out.println(re);
	}
}
