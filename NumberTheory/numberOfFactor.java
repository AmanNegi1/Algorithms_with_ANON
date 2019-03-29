package NumberTheory;
import java.util.*;
public class numberOfFactor {
		public static void main(String args[]) {
			Scanner s=new Scanner(System.in);
			
			int arr[]=new int[1000000+1];
			arr[0]=0;
			arr[1]=0;
			for(int i=1;i<=arr.length;i++) {
				if(arr[i]==0) {
				for(int j=2*i;j<=1000000;j+=i) {
					arr[j]=arr[j]+1;
					
				}
				}
				
			}
		    int factorArr[][]=new int[10+1][1000000+1];
			for(int i=1;i<=10;i++) {
				for(int j=1;j<=1000000;j++) {
					if(arr[j]==i) {
						factorArr[i][j]+=factorArr[i][j-1]+1;
					}else {
						factorArr[i][j]+=factorArr[i][j-1];
					}
				}
				
				
			}
			int tC=s.nextInt();
            while(tC--!=0){
            int a=s.nextInt();
    		int b=s.nextInt();
            int n=s.nextInt();
			System.out.println(factorArr[n][b]-factorArr[n][a-1]);
            }
            }
}
