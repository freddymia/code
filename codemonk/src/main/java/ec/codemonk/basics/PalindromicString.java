package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromicString {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String string = br.readLine();

		int l = 0;
		int r = string.length() - 1;
		boolean exit = false;

		while (l < r && !exit) {
			if (string.charAt(l) == string.charAt(r)) {
				l++;
				r--;
			} else {
				System.out.println("NO");
				exit = true;
			}
		}
		if (!exit)
			System.out.println("YES");
	}

}
