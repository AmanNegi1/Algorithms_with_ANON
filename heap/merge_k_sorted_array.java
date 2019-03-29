package heap;
import java.util.*;
public class merge_k_sorted_array {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		 ArrayList<Integer>ar=new ArrayList<Integer>();
	     PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
	      int i=0;
	      while(i<input.size()){
	        int j=0;
	        while(j<input.get(i).size()){
	          pq.add(input.get(i).get(j));
	        }
	      }
	      while(!pq.isEmpty()){
	        int t=pq.remove();
	        ar.add(t);
	      }
		return ar;	
		}
	
	public static void main(String[] args) {
        
		ArrayList<Integer>input=new ArrayList<Integer>();
   
	}

}
