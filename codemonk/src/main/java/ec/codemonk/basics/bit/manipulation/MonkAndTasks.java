package ec.codemonk.basics.bit.manipulation;

import java.util.Formatter;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MonkAndTasks {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		int t = s.nextInt();

		while (t-- > 0) {

			int n = s.nextInt();

			// n decimals
			int lenghtStr = String.valueOf(n).length();

			StringBuilder sb = new StringBuilder("%0");
			sb.append(lenghtStr);
			sb.append("d");

			TreeMap<Double, Long> kv = new TreeMap<Double, Long>();

			for (int i = 0; i < n; i++) {

				Long timeTask = Long.parseLong(s.next());

				int countOnes = countOnes(timeTask);

				String index = zerosLeftInteger(sb.toString(), i);

				Double k = Double.parseDouble(String.valueOf(countOnes).concat(".").concat(String.valueOf(index)));

				kv.put(k, timeTask);

			}

			for (Map.Entry v : kv.entrySet()) {
				System.out.print(v.getValue() + " " );
			}
			System.out.print("\n");
		}

		s.close();
	}

	private static String zerosLeftInteger(String str, int i) {

		Formatter formatter = new Formatter();
		formatter.format(str, i);

		return formatter.toString();

	}

	private static int countOnes(long tn) {
		return Long.toBinaryString(tn).replaceAll("0", "").length();
	}

}