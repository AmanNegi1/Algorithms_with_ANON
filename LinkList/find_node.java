package LinkList;

public class find_node {
public static void main(String args[]) {
	Node_Creation<Integer> node1=new Node_Creation<Integer>(22);
	Node_Creation<Integer> node2=new Node_Creation<Integer>(22);
	Node_Creation<Integer> node3=new Node_Creation<Integer>(22);
    node1.next=node2;
    node2.next=node3;
    
}
}
