package dynamicProgramming;

public class KnapSack01 {

	public static int knapsack(int weights[],int values[],int maxWeight,int i) {
		if(i==weights.length||maxWeight==0) {
			return 0;
		}
		if(weights[i]>maxWeight) {
			return knapsack(weights,values,maxWeight,i+1);
		}else {
			int op1=values[i]+knapsack(weights,values,maxWeight-weights[i],i+1);
			int op2=knapsack(weights,values,maxWeight,i+1);
			return Math.max(op1, op2);
		}
	}
	public static int knapsack(int weights[],int values[],int maxWeight) {
		return knapsack(weights,values,maxWeight,0);
	}
	public static void main(String[] args) {
     int weight[]= {6,1,2,4,5};
     int values[]= {10,5,4,8,6};
     int maxWeight=5;
     System.out.println("Maximum amount of value at collecting minimum weight: "
     		+ " "+knapsack(weight,values,maxWeight));
	}

}
