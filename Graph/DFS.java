package Graph;

public class DFS {
	public static void printDFShelper(int edegs[][],int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv]=true;
		for(int i=0;i<edegs.length;i++) {
			if(edegs[sv][i]==1 && !visited[i]) {
				printDFShelper(edegs,i,visited);
			}
		}
	}
	public static void print(int edegs[][]) {
		boolean visited[]=new boolean[edegs.length];
		for(int i=0;i<edegs.length;i++) {
		   if(!visited[i]) {
			printDFShelper(edegs,i,visited);
		     }
		   }//end of loop
	}//end of print function
}
