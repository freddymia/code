package ec.codemonk.basics.bit.manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumOfNumbersSolve {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static boolean flag = false;

	public static void check(int s, int i, int arr[], int sum, String nivel) {

		System.out.println("s: " + s + "\ti: " + i + "\tnivel: " + nivel);
		if (s == sum) {
			flag = true;
		}

		if (i < arr.length) {
			check(s + arr[i], i + 1, arr, sum, "1");
			check(s, i + 1, arr, sum, "2");
		}

	}

	public static void main(String[] args) throws java.lang.Exception {

		int t = Integer.parseInt(br.readLine());

		for (; t != 0; t--) {

			flag = false;

			int n = Integer.parseInt(br.readLine());

			StringTokenizer st = new StringTokenizer(br.readLine());

			int i, arr[] = new int[n];

			for (i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			int s = Integer.parseInt(br.readLine());

			if (s == 0) {
				System.out.println("YES");
				continue;
			}

			check(0, 0, arr, s, "0");

			if (flag) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}

		}
	}
}
