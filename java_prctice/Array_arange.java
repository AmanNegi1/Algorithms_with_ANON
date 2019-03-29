package java_prctice;
import java.util.*;

public class Array_arange {
	public static int[] arrange(int n){
	
		  int []a=new int[n];
	      int j=1;

	      for(int i=0;i<n;i++){
	        a[i]=j;
	        if(n%2==0 && a[i]+1==n) {
	        	j++;
	        	//continue;
	        }
	        else if(j<n&&j%2!=0){
	        j=j+2;
	        }
	        else if(j==n){
	        if(n%2==0){
	          j=j-2;
	        }else{
	          j--;
	        } 
	        }
	         else{
	          j=j-2;
	        }
	      }
	  
			return a;
	}
	public static void main(String []args) {
		
	    int n=6;
		
		int a []=arrange(n);
		for(int i=0;i<n;i++) {
			System.out.print(a[i]);
		}
	}

}
