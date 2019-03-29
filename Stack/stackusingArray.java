package Stack;

public class stackusingArray {
    private int data[];
    private int top;
  
    public stackusingArray(){
    	data=new int[10];
    	top=-1;
    	
    }
    public int size() {
    	return top;
    }
    public void print() {
    	for(int i=1;i<=top;i++) {
    		System.out.print(data[i]+" ");
    	}
    }
    public boolean isEmpty() {
    	return (top==-1);
    }
    public void insert(int data)throws stackfullException {
    	if(size()==this.data.length) {
    		stackfullException b=new stackfullException();
    		throw b;
    	}
    	top++;
    	this.data[top]=data;
        
    }
    public int top() throws stackEmpty {
    	
    	if(size()==0) {
    		//
    		stackEmpty e=new stackEmpty();
    		throw e;
    	}
    	return data[top];
    }
    public void pop() throws stackfullException {
    	if(size()==this.data.length) {
    		stackfullException b=new stackfullException();
    		throw b;
    	}
    	System.out.print("The deleted element is : "+data[top]);
    	top--;
    	
    }
    
}
