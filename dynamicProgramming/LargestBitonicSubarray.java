package dynamicProgramming;

import java.util.Scanner;

public class LargestBitonicSubarray {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++) {
    	arr[i]=s.nextInt();
    }
    System.out.println(bitonicSub(arr));
	}


public static int bitonicSub(int arr[]) {
        int[] output1=LIS_longest_common_subseq.LIS(arr);	
        for(int i=0;i<output1.length;i++) {
        	System.out.print(output1[i]+" ");
        }
        System.out.println();
        int l=arr.length-1;
        for(int i=0;i<arr.length/2;i++) {
        	int t=arr[i];
        	arr[i]=arr[l];
        	arr[l]=t;
        	l--;
        }
        for(int i=0;i<arr.length;i++) {
        	System.out.print(arr[i]+" ");
        }
        System.out.println();
        
        int[] output2=LIS_longest_common_subseq.LIS(arr);
        for(int i=0;i<output1.length;i++) {
        	System.out.print(output2[i]+" ");
        }
        System.out.println();
        for(int i=0;i<output1.length;i++) {
        	output1[i]=(output1[i]+output2[i])-1;
        }
        for(int i=0;i<output1.length;i++) {
        	System.out.print(output1[i]+" ");
        }
        System.out.println();
        int max=output1[0];
        for(int i=1;i<output1.length;i++) {
        	if(output1[i]>max) {
        		max=output1[i];
        	}
        }
        return max;
}
}