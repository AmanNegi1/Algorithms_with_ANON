package Recursion;

public class tower_of_honoi {
	static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod)
    {
        if (n == 1)
        {
            System.out.println(  from_rod + " " + to_rod);
            return;
        }
        towerOfHanoi(n-1, from_rod, aux_rod, to_rod);
        System.out.println(  from_rod + " " + to_rod);
        towerOfHanoi(n-1, aux_rod, to_rod, from_rod);
    }
     
    //  Driver method
    public static void main(String args[])
    {
        int n = 2; // Number of disks
        towerOfHanoi(n, 'a', 'b', 'c');  // A, B and C are names of rods
    }
}
