package Graph;

import java.util.*;
public class Graph {

	
	public static void main(String[] args) {

		Scanner s=new Scanner(System.in);
		int n=s.nextInt();//number of vertices
		int e=s.nextInt();//number of edegs
		int edges[][]=new int[n][n];//2d array of vertices
	    for(int i=0;i<e;i++) {
	    	int fv=s.nextInt();
	    	int sv=s.nextInt();
	    	edges[fv][sv]=1;
	    	edges[sv][fv]=1;
	    }
	    System.out.println("DFS");
	    DFS obj=new DFS();
	    obj.print(edges);
	    System.out.println("BFS");
	    BFS obj1=new BFS();
	    obj1.BFS(edges);
	    
	}
	

}
