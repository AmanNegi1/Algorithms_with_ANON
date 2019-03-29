package dynamicProgramming;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class mixture_smoke {

	public static void main(String[] args) throws Exception{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int dp[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				dp[i][j]=-1;
			}
		}
		int cost=minMixtureCost(arr,dp,0,n-1);
		System.out.println(cost);
	}
	public static int minMixtureCost(int arr[], int dp[][],int i,int j) {
		if(i==j) {
			return 0;
		}
		
		if(dp[i][j]!=-1) {
			return dp[i][j];
		}
		int minCost=Integer.MAX_VALUE;
		for(int k=i;k<j;k++) {
		    minCost=Integer.min(minMixtureCost(arr,dp,i,k)+minMixtureCost(arr,dp,k+1,j)+colorSum(arr,i,k)*colorSum(arr,k+1,j), minCost);
		}
		dp[i][j]=minCost;
		return minCost;
	}
	public static int colorSum(int arr[],int i,int j) {
		int s=0;
		for(int k=i;k<=j;k++) {
			s+=arr[k]%100;
		}
		return s;
	}
}
