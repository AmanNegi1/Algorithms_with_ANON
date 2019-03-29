package Stack;

public class stackusinglinklist<T> {

   private Node_Creation<T> head;
   private int size;
   public stackusinglinklist(){
	   head=null;
	   size=0;
   }
   public void insert() {
	   for(int i=1;i<5;i++) {
	   Node_Creation newnode=new Node_Creation(i*2);
       newnode.next=head; 
	   head=newnode;
	   size++;
	   }
	   }
   public int size() {
	   return size;
   }
   public void pop() {
	   while(head!=null) {
	   System.out.println(head.data+" poped successfully");
       head=head.next;
   }
   }
}
