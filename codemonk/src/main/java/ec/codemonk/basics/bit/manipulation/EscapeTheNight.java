package ec.codemonk.basics.bit.manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class EscapeTheNight {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			long result = 0;
			long n = Long.parseLong(br.readLine());
			long in = n;

			while (in > 0) {
				String binary = Long.toBinaryString(in);
				long numbersOne = binary.replaceAll("0", "").length();
				if (numbersOne == 2) {
					result += in;
				}
				in = in - 1;
			}
			System.out.println(result);
		}
		System.exit(0);
	}
}
