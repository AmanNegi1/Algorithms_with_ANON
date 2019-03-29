package dynamicProgramming;
import java.util.Scanner;
public class magic_grid_problem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int testC=sc.nextInt();
        while(testC--!=0) {
        int n=sc.nextInt();
        int m=sc.nextInt();
        int mat[][]=new int[n][m];
        for(int i=0;i<n;i++) {
        	for(int j=0;j<m;j++) {
             mat[i][j]=sc.nextInt();		
        	}
        }				
       int r=magic_grid(mat,0,0,n,m);		
	   System.out.println(r);
       }
     }
	public static int magic_grid(int mat[][],int i,int j,int row,int col) {
		if(i==row || j==col) {
			return 1;
		}
	 	int val1=magic_grid(mat,i+1,j,row,col)-mat[i+1][j];
	    int val2=magic_grid(mat,i,j+1,row,col)-mat[i][j+1];
	    return (int)Math.max(val1, val2);
	}
  
}
