package dynamicProgramming;

public class lootHouses {

	public static int lootHouse(int arr[],int i) {
		if(i>=arr.length) {
			return 0;
		}
		int op1=arr[i]+lootHouse(arr,i+2);
		int op2=lootHouse(arr,i+1);
		return Math.max(op1, op2);
	}
	public static int lootHouseM(int arr[],int i,int store[]) {
		if(i>=arr.length) {
			if(i>arr.length) {
			return 0;
			}
			store[i]=0;
			return store[i];
		}
		if(store[i]!=-1) {
			return store[i];
		}else {
			int op1=arr[i]+lootHouseM(arr,i+2,store);
			int op2=lootHouseM(arr,i+1,store);
			store[i]=Math.max(op1, op2);
			return store[i];
		}
		
	}
	public static int lootDp(int arr[]) {
		int n=arr.length;
		int dp[]=new int[n+1];
		dp[0]=arr[0];
		dp[1]=arr[1];
		for(int i=2;i<n;i++) {
		    dp[i]=Math.max(arr[i]+dp[i-2], dp[i-1]);
		}
		return dp[n-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int arr[]= {5,5,10,100,10,5};
     int store[]=new int[arr.length+1];
     for(int i=0;i<store.length;i++) {
    	 store[i]=-1;
     }
     System.out.println(lootDp(arr));
     System.out.println(lootHouseM(arr,0,store));
  //   System.out.println(lootHouse(arr,0));
	}

}
