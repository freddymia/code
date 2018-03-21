package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MagicalWord {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// number test cases
		int ntc = Integer.parseInt(br.readLine());

		while (ntc-- > 0) {

			int size = Integer.parseInt(br.readLine());

			char[] charSTR = br.readLine().toCharArray();

			for (int i = 0; i < size; i++) {
				System.out.print(getWord(charSTR[i]));
			}

		}

	}

	static String getWord(char c) {

		int ci = (int) c;

		boolean find = false;

		int l = ci;
		int r = ci;

		int primeN = ci;

		while (!find) {

			if (isPrime(l)) {
				primeN = l;
				find = true;
			} else if (isPrime(r)) {
				primeN = r;
				find = true;
			}

			l--;
			r++;

		}

		return String.valueOf((char) primeN);
	}

	static boolean isPrime(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

	static void data() {
		for (int i = 2; i < 100; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}

		System.out.println("\nA: " + (int) 'A' + " Z: " + (int) 'Z');
	}

}
