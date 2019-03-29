package NumberTheory;
import java.util.*;
public class StrangeOrder {
	public static void main(String args[]) {
		 Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			
			//System.out.println(minPrime);
			int secMinPrime=0;
			int num=n;
			Vector<Integer> vr2=new Vector<Integer>();
			Vector<Integer> vr=new Vector<Integer>();
			boolean makeup[]=new boolean[n+1];
	      int t1=0,t2=0;
	      for(int i=0;i<=n;i++)
	        makeup[i] = false;
		for(int i=n;i>=1;i--) {///////////////////////
		    if(makeup[i]==true) {
		    	continue;
		    }
		        int minPrime=getMinPrime(i);
			    int temp=i;	
				int lpd=minPrime;
			
				int x=i;
                int y=x;
				vr.add(x);
                
				makeup[x]=true;
            while(minPrime>1){
              lpd=minPrime;
			while(x>lpd && x!=1) {
				
				//..
                x=x-lpd;
                makeup[x]=true;
				vr.add(x);
				
				//..
			}//end of while../
			while(temp%minPrime==0) {
				temp=temp/minPrime;
			    secMinPrime=temp;
			}
         
           /*for(int j=0;j<=n;j++) {
			vr2.add(vr.get(j));
            vr.remove(j); 
		   } */
         
          minPrime=secMinPrime;
          
			//System.out.println(minPrime);
			//}//end of while..
			
		}
           Integer arr[]=(Integer[])vr.toArray(new Integer[vr.size()]);
          t2=arr.length-1;    
          Arrays.sort(arr, t1, t2);
          Arrays.sort(arr, Collections.reverseOrder());    
         // vr.addAll(arr);  
          Collections.addAll(vr, arr);
        } //end of while loop /../
		for(int i=0;i<n;i++) {
			System.out.print(vr.get(i)+" ");
		}
		//System.out.print(secMinPrime);
		
		}
	

	private static int getMinPrime(int n) {
		boolean sieve[]=new boolean[n+1];
		sieve[0]=false;
		sieve[1]=false;
		for(int i=2;i<sieve.length;i++) {
			sieve[i]=true;
		}
		for(int i=2;i<sieve.length;i++) {
			if(sieve[i]==true) {
				if(n%i==0) {
				return i;
				}
			for(int j=2*i;j<sieve.length;j+=i) {
			   sieve[j]=false;	
			}
		  }
		
	}
		return 1;
}
	}
