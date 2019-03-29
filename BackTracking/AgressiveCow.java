package BackTracking;
import java.util.*;
//import java..*;
public class AgressiveCow {

	public static boolean check(int cows, long positions[],int n, long distance){

		int count = 1;
		 long last_position = positions[0];

		for(int i=1;i<n;i++){
			if(positions[i] - last_position >= distance){
				last_position = positions[i];
				count++;
			}

			if(count == cows){
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
		    int t;
			t=s.nextInt();
			while(t!=0){
				int n,c;
				n=s.nextInt();
				c=s.nextInt();
			    long positions[]=new long [n];
				for(int i=0;i<n;i++){
			    positions[i]=s.nextLong();
				}
				Arrays.sort(positions);
				 long start = 0;
				 long end = positions[n-1] - positions[0];

				 long ans = -1;

				while(start<=end){
					 long mid = start + (end-start)/2;

					if(check(c,positions,n,mid)){
						ans = mid;
						start = mid+1;
					}else{
						end = mid-1;
					}

				}
				System.out.println(ans);
			}

			//return 0;
	}

}
