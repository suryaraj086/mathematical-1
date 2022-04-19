package mathematical1;

public class Mathematical1 {

	int isTwistedPrime(int N) {
		for (int i = 2; i < Math.sqrt(N) + 1; i++) {
			if (N % i == 0) {
				return 0;
			}
		}
		StringBuilder s = new StringBuilder(N + "");
		s.reverse();
		int temp = Integer.parseInt(s.toString());
		for (int i = 2; i < Math.sqrt(temp) + 1; i++) {
			if (temp % i == 0) {
				return 0;
			}
		}
		return 1;
	}

	static int noOfOpenDoors(Long N) {
		int ans = (int) Math.sqrt(N);
		return ans;
	}

	static String isSquare(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
		if (x1 == x3 && y1 == y3 && x2 == x4 && y2 == y4) {
			return "No";
		}
		if (Math.abs(y2 - y4) == Math.abs(y3 - y1) && Math.abs(x2 - x4) == Math.abs(x3 - x1)) {
			return "Yes";
		}
		return "No";
	}

	static Long isPowerOfAnother(Long X, Long Y) {
		if (X == 1 && Y != 1)
			return (long) 0;
		else if (Y == 1)
			return (long) 1;
		while (true) {
			if (Y % X == 0) {
				Y /= X;
				if (Y == 1)
					return (long) 1;
			} else
				break;
		}
		return (long) 0;
	}

	static long getVol(int A, int B) {
		int P = A;
		int Ar = B;
		float l = (float) (P - Math.sqrt(P * P - 24 * Ar)) / 12;
		long V = (long) (l * (Ar / 2.0 - l * (P / 4.0 - l)));
		return V;
	}

	static int isPerfectNumber(Long N) {
		if (N == 1)
			return 0;

		int sum = 1;
		for (int i = 2; i <= Math.sqrt(N); i++) {
			if (N % i == 0) {
				sum += i;
				sum += N / i;
			}
		}

		return sum == N ? 1 : 0;
	}

	static long count(int N) {
		long ans = (long) (Math.sqrt(N));
		return ans;
	}

	Boolean balancedNumber(String N) {
		int mid = N.length() / 2;
		int out2 = 0;
		int out1 = 0;
		int temp = N.length() - 1;
		for (int i = 0; i < mid; i++) {
			out1 += Integer.parseInt(N.charAt(i) + "");
			if (temp > mid) {
				out2 += Integer.parseInt(N.charAt(temp) + "");
				temp--;
			}
		}
		if (out1 == out2) {
			return true;
		}
		return false;
	}

	static long isPallindrome(long N) {
		StringBuilder str = new StringBuilder();

		while (N > 0) {
			str.append(N % 2);
			N = N / 2;
		}
		StringBuilder str1 = new StringBuilder(str);
		str = str.reverse();
		if (str1.toString().equals(str.toString())) {

			return 1;
		}
		return 0;
	}

	long floorSqrt(long x) {
		return (long) sqrt(x);
	}

	public static double sqrt(int num) {
		// temporary variable
		double t;
		double sqrtroot = num / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t + (num / t)) / 2;
		} while ((t - sqrtroot) != 0);
		return sqrtroot;
	}

	public static double sqrt(long num) {
		// temporary variable
		double t;
		double sqrtroot = num / 2;
		do {
			t = sqrtroot;
			sqrtroot = (t + (num / t)) / 2;
		} while ((t - sqrtroot) != 0);
		return sqrtroot;
	}

	long numberOfPaths(int m, int n) {
		if (m == 1 || n == 1)
			return 1;
		return numberOfPaths(m - 1, n) + numberOfPaths(m, n - 1);
	}

	int tour(int petrol[], int distance[]) {
		int n = petrol.length;
		int start = 0, def = 0, cap = 0;
		for (int i = 0; i < n; i++) {
			cap += petrol[i] - distance[i];
			if (cap < 0) {
				start = i + 1;
				def += cap;
				cap = 0;
			}
		}
		if ((def + cap) >= 0)
			return start;
		return -1;
	}

}
