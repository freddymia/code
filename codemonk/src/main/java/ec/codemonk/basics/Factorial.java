package ec.codemonk.basics;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = Integer.parseInt(s.nextLine());

		// n! = n × (n-1)!
		double result = n * factorial(n - 1);

		System.out.println((int) result);

		s.close();
	}

	static double factorial(int n) {
		
		double factorial = 1;
		
		while (n != 0) {
			factorial = factorial * n;
			n--;
		}
		
		return factorial;
	}

}
