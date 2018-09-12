package ec.codemonk.basics.bit.manipulation;

import java.util.Scanner;

public class Mystery {

	public static void main(String[] args) throws Exception {

		Scanner s = new Scanner(System.in);

		while (s.hasNext()) {
			long number = s.nextLong();
			String binary = Long.toBinaryString(number);
			System.out.println(binary.replaceAll("0", "").length());
		}

		s.close();
		System.exit(0);
	}

}
