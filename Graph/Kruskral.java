package Graph;
import java.util.Arrays;
import java.util.Scanner;
class Edge implements Comparable<Edge>{
	int source;
	int dest;
	int weight;
	@Override
	public int compareTo(Edge arg0) {
		return this.weight-arg0.weight;
	}
}
public class Kruskral {
	public static int FindParent(int  v,int parent[]) {
		if(parent[v]==v) {
			return v;
		}
		return FindParent(parent[v],parent);
	}

	private static void Kruskral(Edge[] input,int n) {
	Arrays.sort(input);
	Edge output[]=new Edge[n-1];
	int parent[]=new int[n];
	for( int i=0;i<n;i++) {
		parent[i]=i;
	}
	int count=0;
	int i=0;
	while(count!=n-1) {
		Edge currEdge=input[i];
		int sourceParent=FindParent(currEdge.source,parent);
	    int destParent=FindParent(currEdge.dest,parent);
	    if(sourceParent!=destParent) {
	    	output[count]=currEdge;
	    	count++;
	    	parent[sourceParent]=destParent;
	    }
	    i++;
	}
	for(i=0;i<n-1;i++) {
		if(output[i].source<output[i].dest) {
		System.out.println(output[i].source+" "+output[i].dest+" "+output[i].weight);
		}else {
			System.out.println(output[i].dest+" "+output[i].source+" "+output[i].weight);	
		}
		
		}
		
	}
	
	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
	int V=s.nextInt();
	int E=s.nextInt();
	Edge obj[]=new Edge[E];
	for(int i=0;i<E;i++) {
		obj[i]=new Edge();
		obj[i].source=s.nextInt();
		obj[i].dest=s.nextInt();
		obj[i].weight=s.nextInt();
	}
	Kruskral(obj,V);
	}

	

}
