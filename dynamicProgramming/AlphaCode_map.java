package dynamicProgramming;

import java.util.Scanner;
import java.util.HashMap;
public class AlphaCode_map {

	
	public static void main(String[] args) {
  			Scanner scn = new Scanner(System.in);
		int n = 1;
		while (n != 0) {
			String s = scn.next();
			if (s.equals("0")) {
				return;
			}
			int[] a = new int[s.length()];
			;

			for (int i = 0; i < s.length(); i++) {
				a[i] = s.charAt(i) - '0';
			}
			char[] c = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's',
					't', 'u', 'v', 'w', 'x', 'y', 'z' };
			// HashSet<String> visited = new HashSet<>();
			HashMap<String, Integer> visited = new HashMap<>();
			int res = printss(a, 0, "", c, visited, s);
			System.out.println((res) % mod);
		}
	}

	static int mod = 1000000007;

	private static int printss(int[] a, int i, String asf, char[] c, HashMap<String, Integer> visited, String s) {
		if (i == a.length) {
			return 1;
		}
		if (visited.containsKey(s)) {
			return visited.get(s);
		}
        	if (s.charAt(0)=='0') {
			return 0;
		}
		int si = 0;
		si += printss(a, i + 1, asf + c[a[i] - 1], c, visited, s.substring(1, s.length()));
		visited.put(s.substring(1, s.length()), (si) % mod);
		if (i < a.length - 1) {

			if (a[i] * 10 + a[i + 1] - 1 < 26) {
				asf = asf + c[a[i] * 10 + a[i + 1] - 1];
				si += printss(a, i + 2, asf, c, visited, s.substring(2, s.length()));
				visited.put(s.substring(2, s.length()), (si) % mod);
			}
		}
		return (si) % mod;
	}
}
