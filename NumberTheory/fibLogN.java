package NumberTheory;
import java.util.*;
public class fibLogN {
		public static void power(int[][] mat2,int n) {
		    if(n==0||n==1) {
		    	return ;
		    }
		    power(mat2,n/2);
		    
			multiply(mat2,mat2);
			if(n%2!=0) {
				int mat[][]= {{1,1},{1,0}};
				multiply(mat,mat2);
			}
			
		}
		public static int getfib(int n) {
			int mat[][]= {{1,1},{1,0}};
			power(mat,n-1);
		    return mat[0][0];
		}
		private static void multiply(int[][] mat, int[][] m) {
			int m1[][]=new int[2][2];
			m1[0][0]=mat[0][0]*m[0][0]+mat[0][1]*m[1][0];
			m1[0][1]=mat[0][0]*m[0][1]+mat[0][1]*m[1][1];
			m1[1][0]=mat[1][0]*m[0][0]+mat[1][1]*m[1][0];
			m1[1][1]=mat[1][0]*m[0][1]+mat[1][1]*m[1][1];
			m[0][0]=m1[0][0];
			m[0][1]=m1[0][1];
			m[1][0]=m1[1][0];
			m[1][1]=m1[1][1];
		}
		public static void main(String args[]) {
			int n=8;
			int t=getfib(n-1);
			System.out.println(t);
		}
}
