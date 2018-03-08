package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CountDivisors {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// read n & q
		String lrk = br.readLine();

		int l = Integer.parseInt(lrk.split("\\s")[0]);
		int r = Integer.parseInt(lrk.split("\\s")[1]);
		int k = Integer.parseInt(lrk.split("\\s")[2]);

		int result = 0;
		for (int i = l; i <= r; i++) {
			if (i % k == 0) {
				result++;
			}
		}

		System.out.println(result);
	}

	/**
	 * You have been given 3 integers - l, r and k. Find how many numbers between l
	 * and r (both inclusive) are divisible by k. You do not need to print these
	 * numbers, you just have to find their count.
	 * 
	 * Input Format The first and only line of input contains 3 space separated
	 * integers l, r and k.
	 * 
	 * Output Format Print the required answer on a single line.
	 */

}