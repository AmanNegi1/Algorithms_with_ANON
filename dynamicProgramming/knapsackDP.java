package dynamicProgramming;

public class knapsackDP {

	public static int knapsackDp(int w[],int v[],int maxW) {
		return knapSack(maxW,w,v,w.length);
	}
	static int knapSack(int W, int wt[], int val[], int n) 
    { 
         int i, w; 
     int K[][] = new int[n+1][W+1]; 
     for (i = 0; i <= n; i++) 
     { 
         for (w = 0; w <= W; w++) 
         { 
             if (i==0 || w==0) 
                  K[i][w] = 0; 
             else if (wt[i-1] <= w) 
                   K[i][w] = Math.max(val[i-1] + K[i-1][w-wt[i-1]],  K[i-1][w]); 
             else
                   K[i][w] = K[i-1][w]; 
         } 
      } 
       
      return K[n][W]; 
    } 
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int w[]= {3,4,2,6,7};
     int v[]= {1,3,5,7,4};
     System.out.println(knapsackDp(w,v,5));
	}

}
