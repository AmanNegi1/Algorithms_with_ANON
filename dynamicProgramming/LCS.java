package dynamicProgramming;

import java.util.ArrayList;

public class LCS {

	public static int lcs(String s,String t) {
	
		if(s.length()==0||t.length()==0) {
			return 0;
		}
		if(s.charAt(0)==t.charAt(0)){
			return 1+lcs(s.substring(1),t.substring(1));
		}else {
			int op1=lcs(s,t.substring(1));
			int op2=lcs(s.substring(1),t);
		  //int op3=lcs(s.substring(1),t.substring(1));
		  //line 17 can be ignored ,if you  will make a dry run this step will be included in above two option..
		  //return Math.max(op1,Math.max(op2, op3));
		  return Math.max(op1, op2);
		}
		
	}
	public static int lcsM(String s,String t,int Store[][]) {
		int m=s.length();
	    int n=t.length();
		if(m==0||n==0) {
			Store[m][n]=0;
			return Store[m][n];
		}
		if(Store[m][n]!=-1) {
			return Store[m][n];
		}
		if(s.charAt(0)==t.charAt(0)){
			Store[m][n]= 1+lcsM(s.substring(1),t.substring(1),Store);
		    
		}else {
			int op1=lcsM(s,t.substring(1),Store);
			int op2=lcsM(s.substring(1),t,Store);
			Store[m][n]= Math.max(op1, op2);
		 
		  }
		 return Store[m][n];
	}
	public static int lcsM(String s,String t) {
		int m=s.length();
	     int n=t.length();
	     int store[][]=new int[m+1][n+1];
	     for(int i=0;i<m+1;i++) {
	    	 for(int j=0;j<n+1;j++) {
	    		 store[i][j]=-1;
	    	 }
	     }
	     return lcsM(s,t,store);
	}
	public static int lcsDP(String s,String t) {
		int m=s.length();
	     int n=t.length();
	     int store[][]=new int[m+1][n+1];
	     ArrayList<Character> ar=new ArrayList<Character>();
	     for(int i=0;i<m;i++) {
	    	 store[0][i]=0;
	     }
         for(int j=0;j<n;j++) {
	    	 store[j][0]=0;
	     }
         for(int i=1;i<m+1;i++) {
        	 for(int j=1;j<n+1;j++) {
        		 if(s.charAt(m-i)==t.charAt(n-j)) {
        			 store[i][j]=1+store[i-1][j-1];
        			 
        		 }else {
        			 store[i][j]=Math.max(store[i][j-1], store[i-1][j]);
        			 
        		 }
        	 }
         }
         
         return store[m][n];
	     
	     
	}
	public static void main(String[] args) {
     String p="xxx5y";
     String q="y2xx";
     int t=lcs(p,q);
     System.out.println(t);
     
     System.out.println(lcsM(p,q));
	 System.out.println(lcsDP(p,q));
	}

}
