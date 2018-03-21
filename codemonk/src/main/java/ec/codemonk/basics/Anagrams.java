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

	static int compare(String A, String B) {
		
		
		
		
		return 0;
	}
	
	
	
	
	/**
	 * for (int i = 0; i < strA.length(); i++) {
	 * 
	 * CharSequence cs = String.valueOf(strA.charAt(i));
	 * 
	 * if (!strB.contains(cs)) { characterDelete++; strA=
	 * strA.replaceFirst(String.valueOf(strA.charAt(i)), ""); } }
	 */

}
