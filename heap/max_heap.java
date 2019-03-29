package heap;
import java.util.*;
public class max_heap {
     ArrayList<Integer>maxHeap;
     max_heap(){
    	 maxHeap=new ArrayList();
     }
     int size() {
    	 return maxHeap.size();
     }
     boolean isEmpty() {
    	 return size()==0;
     }
     void Insert(int elem) {
    	 maxHeap.add(elem);
    	 int betaIndex=maxHeap.size()-1;
    	 int papaIndex=(betaIndex-1)/2;
    	 while(betaIndex>0) {
    	 if(maxHeap.get(betaIndex)>maxHeap.get(papaIndex)) {
    		 int temp=maxHeap.get(betaIndex);
    		 maxHeap.set(betaIndex, papaIndex);
    		 maxHeap.set(papaIndex, temp);
    		 betaIndex=papaIndex;
    		 papaIndex=(betaIndex-1)/2;
    	 }else {
    		 return;
    	 }
    	 }
     }
     int removeMax() {
    	 return maxHeap.remove(0);
     }
     int delete_Max() throws IsEmptyException {
    	 if(isEmpty()) {
    		 throw new IsEmptyException();
    	 }
    	 int t=maxHeap.get(0);
    	 maxHeap.set(0, maxHeap.get(maxHeap.size()-1));
    	 maxHeap.remove(maxHeap.size()-1);
    	 int Papaindex=0;
    	 int beta1=1;
    	 int beta2=2;
    	 int index=0;
    	 while(maxHeap.size()>beta1) {
    		 if(maxHeap.get(Papaindex)<maxHeap.get(beta1)) {
    		 	 index=beta1;
    		 }
    	     if(maxHeap.size()>beta2 && maxHeap.get(Papaindex)<maxHeap.get(beta2)) {
    	    	 index=beta2;
		     }
    	     if(Papaindex==index) {
    	    	 break;
    	     }else {
    	     int temp=maxHeap.get(Papaindex);
    	     maxHeap.set(Papaindex, maxHeap.get(index));
    	     maxHeap.set(index, temp);
    	     Papaindex=index;
    	        beta1=2*Papaindex+1;
    	        beta2=2*Papaindex+2;
    	     }
    	     }
    	     return t;
     }
	
}
