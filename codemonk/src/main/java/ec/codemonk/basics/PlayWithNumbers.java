package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayWithNumbers {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// read n & q
		String nq = br.readLine();

		int n = Integer.parseInt(nq.split("\\s")[0]);
		int q = Integer.parseInt(nq.split("\\s")[1]);

		// read items
		String inputItems = br.readLine();

		String[] items = new String[n];

		for (int i = 0; i < n; i++) {
			items[i] = inputItems.split("\\s")[i];
		}

		// iput q & process
		long[] values = new long[q];

		for (int i = 0; i < q; i++) {
			values[i] = getValueFloor(items, br.readLine());
			System.out.println(values[i]);
		}

		/**
		for (int i = 0; i < q; i++) {
			System.out.println(values[i]);
		}
		**/
		
	}

	static long getValueFloor(String[] items, String range) {

		long value = 0;

		int l = Integer.parseInt(range.split("\\s")[0]);
		int r = Integer.parseInt(range.split("\\s")[1]);

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
