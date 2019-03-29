package LinkList;
import java.util.*;
public class appendlist {

	public static void print(Node_Creation<Integer> head) {
	      while(head!=null) {
	    	  System.out.print(head.data+" ");
	            head=head.next;
	      }
		}
	public static Node_Creation<Integer> ListInput() {
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		Node_Creation<Integer> head=null,tell=null;
		while(d!=-1) {
			Node_Creation <Integer> newnode=new Node_Creation(d);
			if(head==null) {
				head=newnode;
				tell=newnode;
			}else {
				tell.next=newnode;
				tell=newnode;
			}
			d=s.nextInt();
		}
		return head;
	}
	public static Node_Creation<Integer> append(Node_Creation<Integer> root, int n) {
		System.out.println("appendedList");
		Node_Creation<Integer> temp=root,tell=null;
		int c1=0;
	      while(temp!=null){
	        tell=temp;
	        temp=temp.next;
	        c1++;
	      }
	    
	      int c=1,p=c1-n+1;
	      while(c<p){
	        tell.next=root;
	        root=root.next;
	        tell=tell.next;
	        tell.next=null;
	        c++;
	      }
	      return root;
	    }
	
	public static Node_Creation<Integer>duplicateFree(Node_Creation<Integer>head){
	Node_Creation <Integer>temp=head,temp2=head.next;
	int f=0;
	while(temp!=null) {
		if(temp.data==temp2.data) {
		temp2=temp2.next;	
		f=1;
		}else {
	     if(f==1) {
	    	 temp.next=temp2;
	    	 temp=temp2;
	    	 temp2=temp2.next;
	     }else {
		temp=temp.next;
		temp2=temp2.next;
		f=0;
		}
	   }//end of else loop
	}//end of while loop 
		return head;
	}
	
	public static void main(String args[]) {
	Node_Creation<Integer> head=ListInput();
	Node_Creation<Integer> head1=head;
//	head=append(head1,3);
	Node_Creation<Integer>head2=head;
	head=duplicateFree(head2);
	print(head);
		
		
	}
}
