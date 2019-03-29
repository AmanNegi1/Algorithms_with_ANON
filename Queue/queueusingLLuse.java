
package Queue;
import Stack.Node_Creation;
import java.util.*;
public class queueusingLLuse {

	
	public static void main(String[] args) throws QueueEmptyException {
	Scanner s=new Scanner(System.in);
	 queueusingLL queue=new queueusingLL();
	 System.out.println("Enter the number of element ");
	 int n=s.nextInt();
	 for(int i=0;i<n;i++) {
		 queue.enqueue(i+1);
	 }
	 queue.print();
//	 Object t=queue.dqueue();
	 System.out.println();
	 System.out.println("Enter the number of elem to del");
	 int m=s.nextInt();
	 System.out.println("Element deleted");
	 for(int j=1;j<m;j++) {
	 System.out.println(queue.dqueue());
	 }
	}

}
