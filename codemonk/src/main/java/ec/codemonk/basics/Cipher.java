package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Cipher {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String message = br.readLine();
		String k = br.readLine();

		// String messageAlphaNumeric = message.replaceAll("[^a-zA-Z0-9]", "");

		// V2
		Map<String, String> memory = new HashMap<String, String>();

		for (int i = 0; i < message.length(); i++) {

			char ascciValue = 0;

			if (memory.containsKey(String.valueOf(message.charAt(i)))) {

				ascciValue = memory.get(String.valueOf(message.charAt(i))).charAt(0);

			} else {

				int ascii = process(message.charAt(i), Integer.parseInt(k));
				
				ascciValue = (char) ascii;

				memory.put(String.valueOf(message.charAt(i)), String.valueOf(ascciValue));
			}

			System.out.print(ascciValue);
		}

	}

	static int process(char an, int k) {

		int value = 0;

		int ascii = (int) an;

		if (ascii >= 48 && ascii <= 57) {// [0-9]
			value = validate(47, 57, ascii, k);
		} else if (ascii >= 65 && ascii <= 90) {// [A-Z]
			value = validate(64, 90, ascii, k);
		} else if (ascii >= 97 && ascii <= 122) {// [a-z]
			value = validate(96, 122, ascii, k);
		} else {
			value = ascii;
		}

		return value;
	}

	static int validate(int l, int r, int n, int k) {
		int result = 0;
		if (n + k > r) {
			int c1 = k - (r - n);
			if (c1 > r) {
				int c2 = k - (k / (r - l));
				result = (l + c2);
			} else {
				result = l + c1;
			}
		} else {
			result = (n + k);
		}
		return result;
	}

}
