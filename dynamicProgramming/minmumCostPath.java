package dynamicProgramming;
import java.util.*;
public class minmumCostPath {

	public static int MinCostM(int[][] arr,int i,int j,int [][]store ) {
		 int m=arr.length;
		 int n=arr[0].length;    
		 if(i==m-1||j==n-1) {
			    store[i][j]=arr[i][j];
		    	return store[i][j];
		    }
		    if(i>=m||j>=n) {
		    	return Integer.MAX_VALUE;
		    }
		    if(store[i][j]!=-1) {
		    	return store[i][j];
		    }
		    int op1=MinCostM(arr,i,j+1,store);
		    int op2=MinCostM(arr,i+1,j+1,store);
		    int op3=MinCostM(arr,i+1,j,store);
		    store[i][j]=arr[i][j]+Math.min(op1, Math.min(op2, op3));
		    return store[i][j];
	}
	public static int minCost(int ar[][],int i,int j) {
		int m=ar.length;
		int n=ar[0].length;
	    if(i==m-1||j==n-1) {
	    	return ar[i][j];
	    }
	    if(i>=m||j>=n) {
	    	return Integer.MAX_VALUE;
	    }
	    int op1=minCost(ar,i,j+1);
	    int op2=minCost(ar,i+1,j+1);
	    int op3=minCost(ar,i+1,j);
	    return ar[i][j]+Math.min(op1, Math.min(op2, op3));
	}
	public static int minCostDp(int arr[][]) {
		int m=arr.length;
		 int n=arr[0].length;
	     int store[][]=new int[m][n];
	     store[m-1][n-1]=arr[m-1][n-1];
	     //last row filling
	     for(int j=n-2;j>=0;j--) {
	    	 store[m-1][j]=store[m-1][j+1]+arr[m-1][j];
	     }
	     //last column filling
         for(int j=m-2;j>=0;j--) {
        	 store[j][n-1]=store[j+1][n-1]+arr[j][n-1];
	     }
         for(int i=m-2;i>=0;i--) {
        	 for(int j=n-2;j>=0;j--) {
        		 store[i][j]=arr[i][j]+Math.min(store[i][j+1],Math.min(store[i+1][j+1],store[i+1][j]));
        	 }
         }
         return store[0][0];
	}
	
	public static void main(String[] args) {
     int arr[][]= {{0,4,5,1},{5,2,1,1},{6,1,3,0}};
     int p=minCost(arr,0,0);
 	 int m=arr.length;
	 int n=arr[0].length;
     int store[][]=new int[m][n];
     for(int i=0;i<m;i++) {
    	 for(int j=0;j<n;j++) {
    		 store[i][j]=-1;
    	 }
     }
     System.out.println(MinCostM(arr,0,0,store));
     System.out.println(p);
	 System.out.println("Dp Output: "+minCostDp(arr));
	}

}
