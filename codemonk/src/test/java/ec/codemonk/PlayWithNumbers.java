package ec.codemonk;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PlayWithNumbers{

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");

		int n = Integer.parseInt(str[0]);
		int q = Integer.parseInt(str[1]);

		str = br.readLine().split(" ");

		long[] arr = new long[n];

		arr[0] = Integer.parseInt(str[0]);

		for (int i = 1; i < str.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
			arr[i] = arr[i] + arr[i - 1];
		}

		while (q-- > 0) {
			
			str = br.readLine().split(" ");
			
			int s = Integer.parseInt(str[0]);
			int d = Integer.parseInt(str[1]);
			
			long cal;
			
			if (s - 2 > -1) {
				cal = (arr[d - 1] - arr[s - 2]) / (d - s + 1);
			} else
				cal = arr[d - 1] / (d - s + 1);

			System.out.println(cal);
		}

	}
}
