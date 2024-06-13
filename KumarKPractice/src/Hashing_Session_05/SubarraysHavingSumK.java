package Hashing_Session_05;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SubarraysHavingSumK {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// TODO Auto-generated method stub
		long n = scanner.nextLong();
		long k = scanner.nextLong();
		long[] b = new long[(int) (n + 1)];
		for (int i = 1; i <= n; i++) {
			b[i] = scanner.nextLong();
		}
		Map<Long, Long> u = new HashMap<>();
		u.put(0L, 1L);
		long c = 0;
		long count = 0;
		int i = 1;

		while (i <= n) {
			c = c + b[i];
			long vl = c - k;
			count = count + u.getOrDefault(vl, 0L);
			u.put(c, u.getOrDefault(c, 0L) + 1);
			i++;
		}

		System.out.println(count);

	}

}
