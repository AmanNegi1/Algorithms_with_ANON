package Queue;

public class queueusingarray {
private int rear=-1;
private int data[];
private int front=-1;
private int size=0;
queueusingarray(){
	data=new int[10];
}
int size() {
	return size;
}
boolean isempty() {
	return (size()==0);
}
void enqueue(int data) throws QueueFullException{
	if(size==this.data.length) {
		throw new QueueFullException();
	}
	size++;
	rear++;
	this.data[rear]=data;
	if(front==-1) {
		front=rear;
	}
	if(rear==this.data.length) {
		rear=0;//when array gets  full
	}
}
void dqueue()throws QueueEmptyException {
	if(front==-1) {
		
		throw new QueueEmptyException();
	  
	}
	System.out.println(data[front]+" deleted");
	
	front++;
	size--;
	
}
}
