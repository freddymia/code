package ec.codemonk;

import ec.codemonk.utils.IOUtils;
import ec.codemonk.utils.InputReader;
import ec.codemonk.utils.OutputWriter;

public class InputOutputReader {

	public static void main(String[] args) {
		// initialize
		InputReader in = new InputReader(System.in);
		OutputWriter out = new OutputWriter(System.out);

		// read int
		int i = in.readInt();
		// read string
		String s = in.readString();
		// read int array of size N
		int[] x = IOUtils.readIntArray(in, 0);
		// printline
		out.printLine("X");

		// flush output
		out.flush();

		// remember to close the
		// outputstream, at the end
		out.close();

	}

}
