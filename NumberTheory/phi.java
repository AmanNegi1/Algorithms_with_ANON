package NumberTheory;

public class phi {

	public static int phi (int n) {
		int result = n;
		for (int i=2; i*i<=n; ++i)
			if (n % i == 0) {
				while (n % i == 0)
					n /= i;
				result -= result / i;
			}
		if (n > 1)
			result -= result / n;
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(phi(16));
	}

}
