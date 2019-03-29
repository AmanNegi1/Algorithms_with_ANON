package NumberTheory;
import java.util.*;
public class findQubeFreeNum {

	public static long findQubeFree(int n,int testcase) {
		long p=1;
        long y=-1;
		long arr[]=new long[1000000+1];
		for(int i=2;i<=n;i++) {
			
			long t=i*i*i;
            long modNum=t%(long)Math.pow(10,9)+7;
            t=modNum;
			for(long j=t;j<=arr.length;j=p*t) {
            if(j<=1000000)  
			arr[(int) j]=y;	
			p++;
			}
			p=0;
		}//end of for loop..
		int k=0;
		for(int i=1;i<=1000000;i++) {
			if(arr[i]!=-1) {
				k++;
				arr[i]=k;
			}
		}
		

		     if(arr[n]==-1) {
		    	 System.out.print("Case "+testcase+": Not Cube Free");
                 System.out.println();
               //return arr[n];
					
		     }else {
		    	 System.out.print("Case "+testcase+": ");
		        
             
		}
      return arr[n];
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		findQubeFree(s.nextInt());
	}
}
