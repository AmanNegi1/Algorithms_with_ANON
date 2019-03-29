package Queue;

public class queueusingarrayUse {

	public static void main(String[] args) throws QueueEmptyException {
		queueusingarray queue=new queueusingarray();
		for(int i=1;i<=10;i++) {
		queue.enqueue(i);
		}
	//	queue.print();
		for(int i=1;i<=9;i++) {
		queue.dqueue();
		}
	}

}
