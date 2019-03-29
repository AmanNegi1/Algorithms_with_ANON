package dynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;
public class maximum_sum_rectangle {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	//int n=s.nextInt();
	//int m=s.nextInt();
	//int mat[][]=new int[n][m];
	/*for(int i=0;i<n;i++) {
		for(int j=0;j<m;j++) {
			mat[i][j]=s.nextInt();
		}
	}*/
	int mat[][]= {
			{-1 ,-2 ,-2 ,-2},
			{-5 ,-4, -1 ,-9},
			{-3, -2 ,-6 ,-3},
			{-4 ,-3 ,-3 ,-2},
			
		 };
	
     int r=max_sum_rec(mat);
     System.out.print(r); 
    }
	public static int max_sum_rec(int mat[][]) {
		int n=mat.length;
		int m=mat[0].length;
		int k=0;
		int pre_max=Integer.MIN_VALUE;
		int cur_max=0;
		int sum_arr[]=new int[mat.length+1];
		for(int i=0;i<m;i++) {
			Arrays.fill(sum_arr, 0);
			for(int j=i;j<m;j++) {
				for(k=0;k<n;k++) {
				sum_arr[k]+=mat[k][j];
				}
				cur_max=kadane_algo(sum_arr);
				//System.out.print(cur_max+" ");
				if(cur_max>pre_max) {
					pre_max=cur_max;
				}
			}
		}
		return pre_max;
	}
	public static int kadane_algo(int arr[]) {
		int cur_max=0;
		int pre_max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			cur_max=cur_max+arr[i];
			if(cur_max>pre_max) {
				pre_max=cur_max;
			}
			if(cur_max<0) {
				cur_max=0;
			}
		}
		return pre_max;
	}
}
