package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class matrixMulti {

	public static int getCost(int dp[][],int ar[],int i,int j) {
		if(i==j)return 0;
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int cost=Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
		 int possibleAns=getCost(dp,ar,k,i)+ getCost(dp,ar,k+1,j)+ar[i-1]*ar[k]*ar[j];
		 cost=Integer.min(possibleAns,cost);
	     
		}
		dp[i][j]=cost;
		return cost;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arn[]=new int[n+1];
		for(int i=0;i<=n;i++) {
		 arn[i]=sc.nextInt();
		}
		int dp[][]=new int[arn.length][arn.length];
	    for(int i=0;i<=n;i++) {
	    	Arrays.fill(dp[i], -1);
	    }//end of for../
	    System.out.println(getCost(dp,arn,1,n-1));
	}

}
