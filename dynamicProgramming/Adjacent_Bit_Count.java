package dynamicProgramming;

import java.util.Scanner;

public class Adjacent_Bit_Count {

	public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
     int n=sc.nextInt();
     int k=sc.nextInt();
     int dp[][][]=new int[n+1][k+1][2];
     for(int i=0;i<=n;i++) {
    	 for(int j=0;j<=k;j++) {
    		 for(int l=0;l<2;l++) {
    			 dp[i][j][l]=-1;
    		 }
    	 }
     }
     System.out.println(bit_Count(n,k,0)+bit_Count(n,k,1));
     int a=bitC_dp(n,k,0,dp);
     for(int i=0;i<=n;i++) {
    	 for(int j=0;j<=k;j++) {
    		 for(int l=0;l<2;l++) {
    			 dp[i][j][l]=-1;
    		 }
    	 }
     }
     int b=bitC_dp(n,k,1,dp);	
     System.out.println(b+a);
	}
 public static int bit_Count(int n,int k, int first) {
	 if(n==1) {
		 if(k==0) {
			 return 1;
		 }
	 }
	 if(n<=0) {
		 return 0;
	 }
	 
	 if(first==0) {
		 		 return bit_Count(n-1,k,0)+bit_Count(n-1,k,1);
		 }
		 
	 if(first==1){
		 return bit_Count(n-1,k-1,1)+bit_Count(n-1,k,0);
	 }
	 return 0;
 }
 public static int bitC_dp(int n,int k,int first,int dp[][][]) {
	 if(n==1) {
		 if(k==0) {
			 dp[n][k][first]=1;
			 return 1;
		 }
		 }
		 if(n<=0 || k<=0) {
			 dp[n][k][first]=0;
			 return 0;
		 }
		 
		if(first==0) {
			   
			   if(dp[n-1][k][0]==-1 ) {
					
					dp[n-1][k][0]= bitC_dp(n-1,k,0,dp);
	           }  
	           if(dp[n-1][k][1]==-1) {
	           
					dp[n-1][k][1]=bitC_dp(n-1,k,1,dp);
					
			   }
	           dp[n][k][first]=dp[n-1][k][0]+dp[n-1][k][1];
	         return (dp[n-1][k][0]+dp[n-1][k][1]);
	       }
		
	   if(first==1) {
		  
		   if(dp[n-1][k-1][1]==-1 ) {
				 dp[n-1][k-1][1]=bitC_dp(n-1,k-1,1,dp);
		   }
		   if(dp[n-1][k][0]==-1 ) {
				dp[n-1][k][0]=bitC_dp(n-1,k,0,dp);
			}
		   dp[n][k][first]=dp[n-1][k-1][1]+dp[n-1][k][0];
		   return (dp[n-1][k-1][1]+dp[n-1][k][0]);
	   }
	 
	 return 0;
 }
}
