package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ToggleString {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// String
		String str = br.readLine();

		for (int i = 0; i < str.length(); i++) {

			String sv = String.valueOf(str.charAt(i));

			int ci = (int) str.charAt(i);

			if (ci >= 65 && ci <= 90) {
				sv = String.valueOf(str.charAt(i)).toLowerCase();
			} else {
				sv = String.valueOf(str.charAt(i)).toUpperCase();
			}

			System.out.print(sv);
		}
	}

}
