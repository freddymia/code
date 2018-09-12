package ec.codemonk.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TheBestInternetBrowser {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tc = Integer.parseInt(br.readLine());

		while (tc-- > 0) {

			StringBuilder result = new StringBuilder();

			String originalUrl = br.readLine();

			int firstPoint = originalUrl.indexOf(".");
			int endIndex = originalUrl.lastIndexOf(".");

			String strComplete = originalUrl.substring(firstPoint + 1, endIndex);
			String strFilter = strComplete.replaceAll("[aeiou]", "").trim();

			result.append(strFilter.length() + 4).append("/").append(strComplete.length() + 8);

			System.out.println(result);
		}
	}

}
