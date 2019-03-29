package dynamicProgramming;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import FastScanner.FastReader;

public class Number_of_R_s {

	public static void main(String[] args) throws IOException {
		Scanner s=new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int testCases=s.nextInt();
		while(testCases--!=0) {
			
			String str=br.readLine();
			
			System.out.println(numberofR(str));
			str="";
		}
	}
	public static int numberofR(String str) {
	 int r =lis_of_k(str);
	 int c=0;
	 for(int i=0;i<str.length();i++) {
		 if(str.charAt(i)=='R') {
			 c++;
		 }
	 }
	 return c+r;
	}
	public static int lis_of_k(String st) {
		int output[]=new int[st.length()+1];
		output[0]=1;
	    for(int i=1;i<st.length();i++) {
	    	output[i]=1;
	    	if(st.charAt(i)=='R') {
    			continue;
    		}
	    	for(int j=i-1;j>=0;j--) {
	    		if(st.charAt(j)=='R'&& st.charAt(i)=='K') {
	    			 
	    			break;
	    		} 	
	    		int ans=output[j]+1;
	    		
	    		if(output[i]<=ans) {
	    			output[i]=ans;
	    		}
	    		
	    	}
	    }
	    for(int i=0;i<output.length;i++) {
	    	System.out.print(output[i]+" ");
	    }
	    int best = 0;
		for (int i = 0; i < st.length(); i++) {
			if (best < output[i]) {
				best = output[i];
			}
		}
		return best;
	}

}
