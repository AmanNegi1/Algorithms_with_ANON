package LinkList;

public class Test {

	public static void main(String[] args) {
		appendlist obj=new appendlist();
		Node_Creation<Integer>head=obj.ListInput();
		Node_Creation <Integer>t=head;
		head=head.next;
		t.next=null;
	
	//	obj.print(head);
	}

}
