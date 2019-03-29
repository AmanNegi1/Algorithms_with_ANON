package BackTracking;
import java.util.*;
public class murderCase {

	public static int  findCase(int arr[],int s,int e) {
		if(s>=e) {
			return 0;
		}
		int sum=0;
		int mid=(s+e)/2;
//		for(int i=1;i<=mid;i++) {
//			for(int j=0;j<i;j++) {
//			if(arr[j]<=arr[i]) {
//				sum+=arr[j];
//			}
//			
//			}
//		}
//		for(int i=mid+2;i<=e;i++) {
//			for(int j=mid+1;j<i;j++) {
//			if(arr[j]<=arr[i]) {
//				sum+=arr[j];
//			}
//			}
//		}
		int s1=findCase(arr,s,mid);
	
		int s2=findCase(arr,mid+1,e);
		int sum2=s1+s2;;
		
		sum2=sum2+mergeAndSum(arr,s,e);
		
		return sum2;
	}
	public static int mergeAndSum(int arr[],int s,int e) {
		int mid=(s+e)/2;
		int sE=mid;
		int sI=s;
		int eS=mid+1;
		int r=e-mid;
		int ans[]=new int[e-s+1];
		int sum=0;
		int k=0;
		while(s<=sE && eS<=e) {
			if(arr[s]<arr[eS]) {
				ans[k]=arr[s];
				sum+=arr[s]*(e-eS+1);
				s++;
				k++;
			}else {
				ans[k]=arr[eS];
				k++;
				eS++;
			}
			
		}//end of while loop..
		while(s<=sE) {
			ans[k]=arr[s];
			s++;
			k++;
		}
		while(eS<=e) {
			ans[k]=arr[eS];
			k++;
			eS++;
		}
		for(int i=0;i<ans.length;i++) {
			arr[sI+i]=ans[i];
		}
		return sum;
	}
	
	
	public static void main(String args[]) {
		int arr[]= {1,5,3,6,4,7,9};
		System.out.println(findCase(arr,0,arr.length-1));
//		for(int i:arr) {
//			System.out.println(i);
//		}
	
	}
}
