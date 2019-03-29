package heap;
import java.util.*;
public class InPlace_Heap {
 
	public static void heapCreation(int ar[],int j) {
		int child=j;
		int parent=(child-1)/2;
		while(child>0) {
			if(ar[child]<ar[parent]) {
				int temp=ar[parent];
				ar[parent]=ar[child];
				ar[child]=temp;
				child=parent;
				parent=(child-1)/2;
				
			}else {
				return;
			}
			
		}
	}
	public static int remove(int ar[],int size) {
		int temp=ar[0];
		ar[0]=ar[size-1];
		size--;
		//]=Integer.MIN_VALUE;
		int parent=0;
		
		int child1=1;
		int child2=2;
		while(child1>size) {
			int index=parent;
			if(ar[parent]>ar[child1]) {
				index=child1;
			}
			if(child2<size && ar[parent]>ar[child2]) {
				index=child2;
			}if(index==parent) {
				break;
			}else {
			int t=ar[parent];
			ar[parent]=ar[index];
			ar[index]=t;
			parent=index;
			child1=2*parent-1;
			child2=2*parent-2;
		}}
		return temp;
	}
    public static void main(String args[]) {
	 int arr[]= {6,3,9,2,66,90};
 	 
     for(int i=0;i<arr.length;i++) {
    	 heapCreation(arr,i);
        }
     for(int k=0;k<arr.length;k++) {
       	System.out.println(arr[k]);
         }
     for(int j=0;j<arr.length;j++) {
    	 arr[arr.length-1-j]=remove(arr,arr.length-j);
        }
     
     }
	
}
