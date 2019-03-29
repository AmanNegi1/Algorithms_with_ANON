package BackTracking;
import java.util.*;
public class ActivitySelection {

	public static void main(String args[]) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int s[]= {1,3,0,5,3,5,6,8,8,2};
		int f[]= {4,5,6,7,8,9,10,11,12,13};
		int temp1=0;
		int temp2=0;
		int r=0;
		for(int j=1;j<f.length;j++ ) {
			for(int i=0;i<f.length-1;i++)
			{
				if(f[i]>f[i+1]) {
					int t=f[i];
					f[i]=f[i+1];
					f[i+1]=t;
					temp1=a[i];
					a[i]=a[i+1];
					a[i+1]=temp1;
					temp2=s[i];
					s[i]=s[i+1];
					s[i+1]=temp2;
					
				}
				
			}
			
		}
		
	   int	m=1;
	   System.out.println(a[0]+" is selected");
	   for(int i=2;i<f.length;i++) {
		   if(s[i]>=f[m]) {
			   m=i;
		      System.out.println(a[m]+" is selected");
		   }
		   
	   }
	}
}
