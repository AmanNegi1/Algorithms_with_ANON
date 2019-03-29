package Queue;
import java.util.*;
import Stack.Node_Creation;
public class queueusingLL<T> {
private  Node_Creation rear;
private  Node_Creation front;
private int size;
public queueusingLL(){
	rear=null;
	front=null;
	size=0;
}
public boolean isempty() {
	return size()==0;
}
public void print() {
	System.out.print("Queue :");
	Node_Creation temp=front;
	while(temp!=rear) {
		System.out.print(temp.data+" ");
		temp=temp.next;
	}
}
public void enqueue(T data) {
//	Scanner s=new Scanner(System.in);
//	int n=s.nextInt();
    Node_Creation<T>newnode=new Node_Creation<>(data);
     if(front==null) {
    	 rear=newnode;
    	 front=newnode;
     }else {
     rear.next=newnode;
     rear=newnode;
     }
     size++;
     }//end of enqueue..
public int size() {
	return size;
}
public T dqueue() throws QueueEmptyException {
    if(size()==0) {
    	throw new QueueEmptyException();
    }
   
	 T t=(T) front.data;
    System.out.println(front.data);
    front=front.next;
  size--;
  return t;
}

}
