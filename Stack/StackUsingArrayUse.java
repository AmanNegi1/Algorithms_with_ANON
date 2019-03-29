package Stack;

public class StackUsingArrayUse {

	public static void main(String[] args) throws stackfullException {
		// TODO Auto-generated method stub
      stackusingArray d=new stackusingArray();
	  for(int i=0;i<10;i++) {
		  d.insert(i);
	  }
	  d.print();
	  System.out.println();
	  d.pop();
	  System.out.println();
	  d.print();
	  System.out.println();
	  System.out.println(d.size());
	}

}
