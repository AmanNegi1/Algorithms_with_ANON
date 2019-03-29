package heap;
import java.util.*;
public class find_median {

	public static void getMedian(int arr[]) {
     PriorityQueue<Integer> pq1=new PriorityQueue<Integer>();
     PriorityQueue<Integer> pq2=new PriorityQueue<Integer>();
     int med[]=new int[100];
     int med1[]=new int[100];
     for(int i=0;i<arr.length;i++) {
    	 pq1.add(arr[i]);
    	 pq2.add(arr[i]);
    	 for(int j=0;j<=i;j++) {
    		 int p=pq1.remove();
    		 med[j]=p;
    		 System.out.println(p);
    	 }
    	 for(int j=0;j<=i;j++) {
    		 int t=pq2.remove();
    		 pq1.add(t);
    		 pq2.add(t);
    	 }
    	 System.out.println();
    	 int k=0;
    	 if(i%2!=0) {
    		k=i/2;
    		int s=arr[k]+arr[k+1];
    		med1[i]=s/2;
    	//	System.out.println(s/2);
    	 }else {
    		// System.out.println(arr[k]);
    		 med1[i]=arr[k];
    	 }
     }
		
//     for(int i=0;i<med1.length;i++) {
//			System.out.print(med1[i]+" ");
//			} 		
//		
	}
	public static void main(String args[]) {
		int arr[]= {6,2,1,3,7,5};
	//	for(int i=0;i<arr.length;i++) {
		getMedian(arr);
	//	}
		
	}
}
