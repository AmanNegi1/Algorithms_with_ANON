package Graph;
import java.util.*;
public class HasPath {

	 public static boolean HashPath(int edege[][],int v1,int v2){
	      boolean visited[]=new boolean[edege.length];
	      return HashPathPro(edege,v1,v2,visited);
	     
	    }
	  public static boolean HashPathPro(int edege[][],int v1,int v2,boolean visited[]){
	     if(edege[v1][v2]==1){
	        return true;
	      }
	      for(int i=0;i<=v2;i++){
	        if(edege[v1][i]==1 && !visited[i]){
	          visited[i]=true;
	          boolean bc=HashPathPro(edege,i,v2,visited);
	          if(bc==true){
	            return true;
	          }
	        }
	      }
	    return false;
	  }
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			int V = s.nextInt();
			int E = s.nextInt();
	        int edege[][]=new int[V][V];
	      for(int i=0;i<E;i++){
	        int fv=s.nextInt();
	        int sv=s.nextInt();
	        edege[fv][sv]=1;
	        edege[sv][fv]=1;
	      }//end of for loop..
	      int v1=s.nextInt();
	      int v2=s.nextInt();
	      boolean b=HashPath(edege,v1,v2);
	      System.out.println(b);
		}//end of main function..
}
