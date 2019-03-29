package heap;

public class minHeapUse {

	public static void main(String[] args) {

		min_heap heap=new min_heap();
		int arr[]= {1 ,3 ,1, 4 ,1 ,63 ,1 ,21 ,1, 9, 2 ,3 ,1 ,7 ,2 ,3 ,2 ,3 ,3 };
		for(int i:arr) {
			heap.insert(i);
		}
		for(int i:arr) {
			try {
				int d=heap.delete();
			   System.out.println(d);
			} catch (IsEmptyException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
