package ec.codemonk.utils;

import java.util.Scanner;

public class CountDivisors {

	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) throws Exception {
		int l = sc.nextInt(), r = sc.nextInt(), k = sc.nextInt();
		System.out.println((r / k) - ((l - 1) / k));
	}

}
