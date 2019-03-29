package Graph;

import java.util.Scanner;

public class Prims_Algorithm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int v=s.nextInt();
		int e=s.nextInt();
		int edges[][]=new int[v][v];
		for(int i=0;i<e;i++) {
				int fv=s.nextInt();
				int sv=s.nextInt();
				int weight=s.nextInt();
				edges[fv][sv]=weight;
				edges[sv][fv]=weight;
		}
		prims(edges,v);
		
	}

	private static void prims(int[][] edges, int v) {
		int parent[]=new int[v];
		int weight[]=new int[v];
		boolean visited[]=new boolean[v];
		for(int i=0;i<edges.length;i++) {
			visited[i]=false;
			weight[i]=Integer.MAX_VALUE;
		}
		
		weight[0]=0;
		parent[0]=-1;
		for(int i=0;i<v;i++) {
		int minVertex=findMinVertex(weight,visited,v);
		visited[minVertex]=true;
		for(int j=0;j<v;j++) {
			if(edges[minVertex][j]!=0 && !visited[j]) {
				if(edges[minVertex][j]<weight[j]) {
					weight[j]=edges[minVertex][j];
					parent[j]=minVertex;
				}
			}
		}
		}
		System.out.println();
		for(int i=1;i<v;i++) {
			if(parent[i]<i) {
				System.out.println(parent[i]+" "+i+" "+weight[i]);
			}else {
				System.out.println(i+" "+parent[i]+" "+weight[i]);
			}
		}
	}

	private static int findMinVertex(int[] weight, boolean[] visited, int v) {
		int minVertex=-1;
		for(int i=0;i<v;i++) {
			if(!visited[i] && (minVertex==-1||weight[i]<weight[minVertex])) {
				minVertex=i;
			}
		}
		return minVertex;
	}

}
