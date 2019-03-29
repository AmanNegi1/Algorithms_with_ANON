package java_prctice;

public class print2d_arr {

	public static  void print2d(int input[][]) {
		for(int j=0;j<input.length;j++);
        {
        int  p=0;
          for(int k=0;k<input[0].length;k++){
            System.out.print(input[p][k]+" ");
          }
          System.out.println();
        }
   
    	  for(int j=1;j<input.length;j++);
        {
          int j=1;                        

          for(int k=0;k<input[j].length;k++){
            System.out.print(input[j][k]+" ");
          }
         
        }
          System.out.println();
    for(int j=2;j<input.length-1;j++);
        {
        int  j=2;
          for(int k=0;k<input[j].length;k++){
            System.out.print(input[j][k]+" ");
          }
         
        }
      
	}
	public static void main(String args[]) {
		int arr[][]= {
				{1,2,4},{5,6,7},{8,9,0}
		};
		print2d(arr);
	}
}
