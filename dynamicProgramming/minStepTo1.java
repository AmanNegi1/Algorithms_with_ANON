package dynamicProgramming;
import java.util.*;
public class minStepTo1 {
	public static int minStepM(int n) {
		int Storage[]=new int[n+1];
		return minStepPro(n,Storage);
	}
	private static int minStepPro(int n, int[] storage) {
		if(n==1) {
			storage[n]=0;
			return storage[n];
		}
		if(storage[n]!=0) {
			return storage[n];
		}
		int op1=minStepPro(n-1,storage);
		int Minstep=op1;
		int op2=0,op3=0;
		if(n%3==0) {
			 op2=minStepPro(n/3,storage);
			 if(op2<Minstep) {
				 Minstep=op2;
			 }
		}
        if(n%2==0) {
		 op3=minStepPro(n/2,storage);	
		 if(op3<Minstep) {
			 Minstep=op3;
		 }
        }
        storage[n]=1+Minstep;
        return storage[n];
		
	}
	
	public static int minStep(int n) {
         
		if(n==1) {
			return 0;
		}
		int op1=minStep(n-1);
		int Minstep=op1;
		int op2=0,op3=0;
		if(n%3==0) {
			 op2=minStep(n/3);
			 if(op2<Minstep) {
				 Minstep=op2;
			 }
		}
        if(n%2==0) {
		 op3=minStep(n/2);	
		 if(op3<Minstep) {
			 Minstep=op3;
		 }
        }
        return 1+Minstep;
	}
	public static int minstepoDp(int n){
	       int storage[]=new int[n+1];
	       for(int i=1;i<=n;i++) {
	    	   if(i==1) {
	    		   storage[i]=0;
	    	   }else
	    	   storage[i]=i;
	       }
	       int tc=0,tc2=0;
	       for(int j=2;j<=n;j++) {
	    	   if(j%2==0&&j%3==0) {
	    		   
	    		   storage[j]=storage[j/2]+1;
	    		   continue;
	    	   }
	    	   if(j%3==0) {
	    		   storage[j]=storage[(j)/3]+1;
	    		   tc++;
	    	   }else if(j%2==0) {
	    		   if(j%2==0&&(j-1)%3==0) {
		    		   storage[j]=tc+1;
		    		   tc2++;
		    		continue;
	    		   }
	    		   storage[j]=storage[(j)/2]+1;
	    				   ++tc2;
	    	   }else {
	    		 
	    		   storage[j]=storage[j-1]+1;
	    		  
	    	   }
	    	   
	       }
	       return storage[n];
		
	}
    public static void main(String[] args) {
	 int a=11;
	// int p=Integer.m
// int p=minStep(a,0);
//	 System.out.println(p);
	 int q=minStepM(a);
	 int p=minstepoDp(a);
	 System.out.println(q);
	 System.out.println(p);
//	 System.out.println(Math.min(p, q)); 
    }

}
