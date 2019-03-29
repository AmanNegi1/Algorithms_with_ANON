package java_prctice;
import java.util.*;
public class push_zero_at_end {
	public static void pushZerosAtEnd(int[] arr){
         int len=arr.length;
         int j=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
                 continue;
			}else if(i==j)
			{
				j++;
			}
			else{
			int t=arr[j];
			arr[j]=arr[i];
			arr[i]=t;
			j++;
			}
		}
		  for (int element: arr) {
	            System.out.println(element);
	        }
		
	}
	public static void main(String []args) {
		int []arr=new int[] {0,3,0,2,0};
		
		pushZerosAtEnd(arr);
		//System.out.println(re);
	}
}
