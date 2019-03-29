package BackTracking;

public class sudokoSolver {
    private int sudokoTable[][];
   
	public sudokoSolver(int sudoko[][]) {
    	this.sudokoTable=sudoko;
    }
	//..
    public void sudokoSolve(int sudoko[][]) {
     if(solve(0,0)) {
    	 showResult();
     }else {
    	 System.out.println("No result found.....");
     }
	}
    private boolean solve(int rowI, int colI) {
		if(rowI==sudokoSolverMain.size && ++colI==sudokoSolverMain.size) {
			return true;
		}
		if(rowI==sudokoSolverMain.size) {
			rowI=0;
		}
		if(sudokoTable[rowI][colI]!=0) {
			return solve(rowI+1,colI);
		}
		for(int num=sudokoSolverMain.min_num;num<=sudokoSolverMain.max_num;num++) {
			if(valid(rowI,colI,num)) {
				sudokoTable[rowI][colI]=num;
			 if(solve(rowI+1,colI)) {
				 return true;
			 }
			 sudokoTable[rowI][colI]=0;
			}
		}
		return false;
	}
    
	private boolean valid(int rowI, int colI, int Actualnum) {
		for(int i=0;i<sudokoSolverMain.size;i++) {
			if(sudokoTable[i][rowI]==Actualnum) {
				return false;
			}
		}
		for(int i=0;i<sudokoSolverMain.size;i++) {
			if(sudokoTable[colI][i]==Actualnum) {
				return false;
			}
		}
		int boxRowOffset=(colI/3)*sudokoSolverMain.boxSize;
		int boxColOffset=(rowI/3)*sudokoSolverMain.boxSize;
		
		for(int i=0;i<sudokoSolverMain.boxSize;i++) {
			for(int j=0;j<sudokoSolverMain.boxSize;j++) {
				if(Actualnum==sudokoTable[boxRowOffset+i][boxColOffset+j]) {
					return false;
				}
					}
		}
		return true;
	}
	
	public void showResult() {
    	for(int i=0;i<sudokoSolverMain.size;i++) {
    		if(i%3==0) {
    			System.out.print(" ");
    		}
    		for(int j=0;j<sudokoSolverMain.size;j++) {
    			if(j%3==0)System.out.print(" ");
    			System.out.print(sudokoTable[i][j]+" ");
    		}
    		System.out.println(" ");
    	}
    }

}
