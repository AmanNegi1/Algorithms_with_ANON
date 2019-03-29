package java_prctice;
import java.util.*;
public class triplet_sum {
public static void tripletSum(int[] input, int x){
		
	for(int i=0;i<input.length;i++) {
		for(int j=i+1;j<input.length;j++) {
			for(int k=j+1;k<input.length;k++) {
				if(input[i]+input[j]+input[k]==x) {
					if(input[i]+input[j]+input[k]==x) {
						if(input[i]<=input[j]&&input[i]<=input[k]) {
							System.out.println(input[i]+" "+input[j]+" "+input[k]);
							break;	
						}else if(input[j]<=input[i]&&input[j]<=input[k]) {
							System.out.println(input[j]+" "+input[i]+" "+input[k]);
							break;
						}else {
							System.out.println(input[k]+" "+input[i]+" "+input[j]);
							break;
						}
					
				}
			}
		}
	}
	}	
	}
	public static void main(String []args) {
		int []arr=new int[] {1, 2, 3,4 ,5 ,6 ,7 };
		int n=12;
		tripletSum(arr,n);
		//System.out.println(re);
	}
}
