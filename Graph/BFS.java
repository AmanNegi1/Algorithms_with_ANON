package Graph;
import java.util.*;

import Queue.QueueEmptyException;
import Queue.queueusingLL;
public class BFS {

	private static void BFSHelper(int edegs[][],int sv,boolean visited[]) {
		queueusingLL<Integer> queue=new queueusingLL<Integer>();
	    queue.enqueue(sv);
	    visited[sv]=true;
	    while(!queue.isempty()) {
	    	try {
				int t=queue.dqueue();
			    System.out.println(t);
			    for(int i=0;i<edegs.length;i++) {
			    	if(edegs[t][i]==1 && !visited[i]) {
			    		queue.enqueue(i);
			    		visited[i]=true;
			    	}
			    }
	    	} catch (QueueEmptyException e) {
			
			}
	    }
	}
	public static void BFS(int edegs[][]) {
		boolean visited[]=new boolean[edegs.length];
		for(int i=0;i<edegs.length;i++) {
			if(!visited[i]) {
		BFSHelper(edegs,i,visited);
			}
		}
	}
}
