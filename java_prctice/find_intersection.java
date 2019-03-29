package java_prctice;
import java.util.*;
public class find_intersection {
	public static int findUnique(int[] arr,int[] arr2){
	    int size=arr.length;
	   // int s=0;
	    int size1=arr2.length;
	     
	      int d=0;
	      for(int i=0;i<size ;i++){
	         d=arr[i];
	      
	        for(int j=0;j<size1;j++){
	         
	          if(d==arr2[j]){
	      
	            System.out.print(" "+d);
	           break;
	          }
	        }//end of inner for loop
	      
	      // return d; 
	      }
	  return 0;
		}
	public static void main(String []args) {
		int []arr=new int[] {2,6,8,5,4,3};
		int []arr2=new int[] {2,3,4,7};
		findUnique(arr,arr2);
		//System.out.println(re);
	}
}
