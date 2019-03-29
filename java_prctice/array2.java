package java_prctice;
import java.util.*;
public class array2 {
	public static int findUnique(int[] arr){
	    int size=arr.length;
	      int f=0;
	      int d=0;
	      for(int i=0;i<size;i++){
	         d=arr[i];
	        f=0;
	        for(int j=0;j<size;j++){
	          if(i==j){
	            continue;
	          }
	          if(d==arr[j]){
	            f=1;
	           break;
	          }
	        }//end of inner for loop
	      if(f==0){
	       System.out.println(d);  
	        
	        return d;
	      }
	      // return d; 
	      }
	  return 0;
		}
	public static void main(String []args) {
		int []arr=new int[] {2,3,1,6,3,6,2};
		int re=findUnique(arr);
		System.out.println(re);
	}
}
