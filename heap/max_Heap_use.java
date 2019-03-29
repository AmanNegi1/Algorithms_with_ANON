package heap;

public class max_Heap_use {

	public static void main(String[] args) {
	
		max_heap heap=new max_heap();
		int arr[]= {6,9,3,12,78,88};
		for(int i=0;i<arr.length;i++) {
			heap.Insert(arr[i]);
		}
		for(int j:arr) {
			try {
				System.out.println(heap.delete_Max());
			} catch (IsEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
