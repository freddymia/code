package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TwoStrings {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		String[] result = new String[T];

		for (int i = 0; i < T; i++) {

			String[] twoStrings = br.readLine().split("\\s");

			// COMPARISON s1 && s2
			if (twoStrings != null && twoStrings.length == 2 && twoStrings[0].length() == twoStrings[1].length()) {

				char[] s1 = twoStrings[0].toCharArray();
				char[] s2 = twoStrings[1].toCharArray();

				int coincidences = 0;
				boolean validar = true;

				for (int x = 0; x < s1.length; x++) {

					CharSequence cs = String.valueOf(s1[x]);

					if (s2.toString().contains(cs)) {

						validar = true;

						for (int y = 0; y < s2.length; y++) {
							if (s1[x] == s2[y]) {
								s2[y] = ' ';
								coincidences++;
								break;
							}
						}

					} else {
						result[i] = "NO";
						validar = false;
					}
				}

				if (validar) {
					if (coincidences == s1.length) {
						result[i] = "YES";
					} else {
						result[i] = "NO";
					}

				}

			}

		}

		for (int j = 0; j < T; j++) {
			System.out.println(result[j]);
		}

	}

}
