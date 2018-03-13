package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ASCIIValue {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println((int) br.readLine().charAt(0));
	}
}
