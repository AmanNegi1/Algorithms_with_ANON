package heap;
import java.util.*;

public class min_heap {
    ArrayList<Integer>heap;
    
    min_heap(){
    	heap=new ArrayList();
    }
    
    boolean isEmpty() {
    	return heap.size()==0;
    }
    
    int size() {
    return heap.size();	
    }
    
    void insert(int elem) {
    	heap.add(elem);
    	int childindex=heap.size()-1;
    	int parentIndex=(childindex-1)/2;
    	while(childindex>0) {
    	if(heap.get(childindex)<heap.get(parentIndex)) {
    		int temp=heap.get(childindex);
    		heap.set(childindex, heap.get(parentIndex));
    		heap.set(parentIndex, temp);
    		childindex=parentIndex;
    		parentIndex=(childindex-1)/2;
    	}else {
    		return;
    	}
    	}
    }
    int delete() throws IsEmptyException{
        if(isEmpty()) {
        	throw new IsEmptyException();
        }
        int t=heap.get(0);
    	heap.set(0,heap.get(heap.size()-1));
       
        heap.remove(heap.size()-1);
        int index=0;
        int child1=1;
        int child2=2;
        int swapIndex=0;
        while(child1<heap.size()) {
        if(heap.get(swapIndex)>heap.get(child1)) {
        	swapIndex=child1;
        }
        if(child2<heap.size()&&heap.get(swapIndex)>heap.get(child2)) {
        	swapIndex=child2;
        }
        if(index==swapIndex) {
        	break;
        }else {
        int temp=heap.get(index);
        heap.set(index, heap.get(swapIndex));
        heap.set(swapIndex, temp);
        index=swapIndex;
        child1=2*index+1;
        child2=2*index+2;
        }
        }
        return t;
    }
    
}
