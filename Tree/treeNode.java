package Tree;

import java.util.ArrayList;

public class treeNode<T> {
        public T data;
        public ArrayList<treeNode<T>> children;
	    public treeNode(T data) {
	    	this.data=data;
	    	children=new ArrayList();
	    }
}
