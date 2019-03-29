package BackTracking;
import java.util.*;
public class Quene {

	public static boolean isPossible(int block[][],int n,int row,int col) {
		//same column..
		for(int i=row-1;i>=0;i--) {
			if(block[i][col]==1) {
				return false;
			}
		}
		
		//left diagonal
		for(int i=row-1 ,j=col-1;i>=0 &&j>=0;i--,j--) {
			if(block[i][j]==1) {
				return false;
			}
		}
		//right diagonal
		for(int i=row-1,j=col+1;i>=0&&j<n;i--,j++) {
			if(block[i][j]==1) {
				return false;
			}
		}
		return true;
		
	}
	public static void nQuene(int block[][],int n,int row) {
		if(row==n) {
			for(int i=0;i<block.length;i++) {
				for(int j=0;j<n;j++) {
					System.out.print(block[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		for(int j=0;j<n;j++) {
			if(isPossible(block,n,row,j)) {
				block[row][j]=1;
				nQuene(block,n,row+1);
			    block[row][j]=0;
			}
		}
		return ;
	}
	public static void main(String args[]) {
		int n=10;
		int block[][]=new int[n][n];
	    nQuene(block,n,0);
	}
}
