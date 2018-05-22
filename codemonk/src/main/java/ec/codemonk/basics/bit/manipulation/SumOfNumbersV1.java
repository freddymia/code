package ec.codemonk.basics.bit.manipulation;

import java.util.Scanner;

public class SumOfNumbersV1 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();

		while (t-- > 0) {

			int n = sc.nextInt();

			int i = 0;
			int[] items = new int[n];

			while (i < n) {
				items[i] = sc.nextInt();
				i++;
			}

			int s = sc.nextInt();

			deepSearch(items, s);

		}

		sc.close();
	}

	private static void deepSearch(int[] items, int s) {

		int i = items[0];
		int r = s - i;

	}

	private static int[] filterRange(int[] items, int s) {
		
		return items;
	}

}
