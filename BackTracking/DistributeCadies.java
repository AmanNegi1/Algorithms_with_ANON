package BackTracking;
import java.util.*;
public class DistributeCadies {

	private static boolean check(long[] box, long mid,int k) {
		int sum=0;
		for(int i=0;i<=mid;i++) {
			long j=(long)box[i]/(long)mid;
			sum+=(int)j;
		//	System.out.println(sum);
		}
		System.out.println("s"+sum);
		if(sum>=k) {
			return true;
		}
		return false;
			
		}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		int end=s.nextInt();
		int k=s.nextInt();
		long box[]=new long[end];
		for(int i=0;i<end;i++) {
			box[i]=s.nextLong();
		}
		long max=0;
		
		for(int i=0;i<end;i++) {
			if(box[i]>max) {
				max=box[i];
			}
		}
		long ans=0;
		
		long start=1;
		Arrays.sort(box);
		while(start<=max) {
			long mid=start+(max-start)/2;
			if(check(box,mid,k)) {
		  	//distrbCadies(box,testCase,mid+1,end,kStud,max);
		    ans=mid;
		    start=mid+1;
			}else {
		    	//distrbCadies(box,testCase,start,mid-1,kStud,max);
		    max=mid-1;
			}
		
		}
		System.out.println(ans);
		//distrbCadies(box,t,0,n,k,max);
	}
    /*
	private static void distrbCadies(int[] box, int testCase,int start, int end, int kStud,int max) {
		if(start>end) {
			return;
		}
		Arrays.sort(box);
		int mid=(start+max)/2;
	    if(check(box,mid,kStud)) {
	    	distrbCadies(box,testCase,mid+1,end,kStud,max);
	    }else {
	    	distrbCadies(box,testCase,start,mid-1,kStud,max);
	    }
	}*/

	
}
