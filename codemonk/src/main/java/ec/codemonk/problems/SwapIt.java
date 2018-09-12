package ec.codemonk.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SwapIt {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int nt = Integer.parseInt(br.readLine());

		while (nt-- > 0) {

			String[] io = br.readLine().split("\\s");

			int ne = Integer.parseInt(io[0]);
			int ns = Integer.parseInt(io[1]);

			String[] array = br.readLine().split("\\s");

		}

	}

}



/**
 
2
3 2
5 3 1			1 5 3 
5 3
8 9 11 2 1		2 8 9 11 1

5 3
9 2 1 5 9
1 9 2 5 9
1 2 9 5 9 	<	9 2 1 5 9
 
 */
