package ec.codemonk.utils;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author finga
 *
 */
public class PlayWithNumbers {

	/**
	 * You are given an array of n numbers and q queries. For each query you have to
	 * print the floor of the expected value(mean) of the subarray from L to R.
	 * 
	 * 
	 * First line contains two integers N and Q denoting number of array elements
	 * and number of queries.
	 * 
	 * Next line contains N space seperated integers denoting array elements.
	 * 
	 * Next Q lines contain two integers L and R(indices of the array).
	 * 
	 * 
	 * print a single integer denoting the answer.
	 * 
	 * :
	 * 
	 * 1<= N ,Q,L,R <= 10^6
	 * 
	 * 1<= Array elements <= 10^9
	 * 
	 * NOTE
	 * 
	 * Use Fast I/O
	 * 
	 */

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// read n & q
		String[] nq = br.readLine().split("\\s");

		int n = Integer.parseInt(nq[0]);
		int q = Integer.parseInt(nq[1]);

		// read items
		String[] items = br.readLine().split("\\s");

		if (items.length == n) {
			while (q-- > 0) {
				System.out.println(getValueFloor(items, br.readLine().split("\\s")));
			}
		}
	}

	static long getValueFloor(String[] items, String[] range) {

		long value = 0;

		int l = Integer.parseInt(range[0]);
		int r = Integer.parseInt(range[1]);

		int sum = 0;
		int con = 0;

		for (int i = (l - 1); i <= (r - 1); i++) {
			sum += Integer.parseInt(items[i]);
			con++;
		}

		if (con > 0) {
			value = (long) sum / con;
		}

		return value;
	}

}