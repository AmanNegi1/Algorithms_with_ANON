package BackTracking;
import java.util.Scanner;
import java.io.*;
public class ratInMaze {

	public static void ratInMaze(int maze[][],int n) {
		int solution[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			solution[i]=new int[n];
		}
		mazehelper(solution,maze,n,0,0);
	}
	private static void mazehelper(int[][] solution, int[][] maze, int n, int i, int j) {
		
		if(i==n-1 || j==n-1) {
			solution[i][j]=1;
			printSoln(solution,n);
			return;
		}
		
		if(i>=n || i<0 || j>=n || maze[i][j]==0 || solution[i][j]==1) {
			return ;
		}
		solution[i][j]=1;
		mazehelper(solution,maze,n,i-1,j);
		mazehelper(solution,maze,n,i+1,j);
		mazehelper(solution,maze,n,i,j-1);
		mazehelper(solution,maze,n,i,j+1);
		solution[i][j]=0;	
	}
	private static void printSoln(int[][] solution, int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(solution[i][j]);
			}
			System.out.println();
		}//end of for loop
	}
	public static void main(String args[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		Scanner s=new Scanner(System.in);
		int n=3;
		int maze[][]=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				//maze[i][j]=Integer.parseInt(br.readLine());
			      maze[i][j]=s.nextInt();
			}
		}
		ratInMaze(maze,n);
	}
}
