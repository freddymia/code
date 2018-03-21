package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Anagrams {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String strA = br.readLine();
			String strB = br.readLine();

			System.out.println(compare(strA, strB));
		}

	}

	static int compare(String strA, String strB) {

		char[] csA = strA.toCharArray();

		int strALength = csA.length;

		for (int i = 0; i < csA.length; i++) {
			if (strB.contains(String.valueOf(csA[i]))) {
				strB = strB.replaceFirst(String.valueOf(csA[i]), "");
				strALength--;
			}
		}

		return (strALength + strB.length());
	}

}
