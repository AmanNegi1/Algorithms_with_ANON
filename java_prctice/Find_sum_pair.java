package java_prctice;
import java.util.*;
public class Find_sum_pair {
	public static void pairSum(int[] input, int x){
		
		for(int i=0;i<input.length;i++) {
            int d=input[i];
			for(int j=i+1;j<input.length;j++) {
				if(d+input[j]==x) {
                  if(d>input[j]){
                   System.out.println(input[j]+" "+d);
 
                  }else{
                    System.out.println(d+" "+input[j]);

                  }
										///input[j]=-1;
				}
			}
		}
	}

	public static void main(String []args) {
		int []arr=new int[] {1,3,6,2,5,4,3,2,4};
		int n=7;
		pairSum(arr,n);
		//System.out.println(re);
	}
}
