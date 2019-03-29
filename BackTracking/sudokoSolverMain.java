package BackTracking;
import java.util.*;
public class sudokoSolverMain {
					public static final int min_num=1;
					public static final int max_num=9;
					static int size=9;
					public static int  boxSize=3;
					public static void main(String args[]) {
					//	Scanner scan=new Scanner(System.in);
						int sudoko[][]= {
								{9 ,0 ,0 ,0 ,2 ,0 ,7 ,5 ,0 },
								{6, 0 ,0, 0, 5, 0 ,0, 4, 0}, 
								{0 ,2, 0, 4, 0 ,0 ,0 ,1 ,0 },
								{2, 0, 8, 0, 0, 0 ,0, 0 ,0 },
								{0 ,7 ,0 ,5 ,0 ,9 ,0 ,6 ,0 },
								{0, 0, 0, 0, 0, 0, 4, 0 ,1 },
								{0 ,1 ,0 ,0 ,0 ,5 ,0 ,8, 0 },
								{0, 9, 0, 0, 7, 0, 0, 0, 4 },
								{0 ,8 ,2 ,0, 4 ,0 ,0 ,0 ,6}
							};
						
						
						sudokoSolver obj=new sudokoSolver(sudoko);
					    obj.sudokoSolve(sudoko);
					}
					
}
