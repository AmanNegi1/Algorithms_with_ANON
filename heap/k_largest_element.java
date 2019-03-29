package heap;
import java.util.*;
public class k_largest_element {

	public static int printKlargest(int arr[],int k) {
		PriorityQueue<Integer>pq=new PriorityQueue<>();
		int i=0;
		for(;i<k;i++) {
			pq.add(arr[i]);
		}
		for(;i<arr.length;i++) {
			int min=pq.element();
			if(min<arr[i]) {
				pq.remove();
				pq.add(arr[i]);
			}
		}
		ArrayList<Integer> ar=new ArrayList<Integer>();
		while(!pq.isEmpty()) {
			//System.out.println(pq.remove());
	        int p=pq.remove();	
            ar.add(p);
	    	}
		  int t=ar.get(0);
	      return t;
	}
	public static void main(String args[]) {
		int arr[]= {66,2,98,9,56};
		int p=printKlargest(arr,3);
	  System.out.print(p);
	}
}
