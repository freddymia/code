package ec.codemonk.basics.bit.manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MaximunANDSolved {

    public static void main(String args[]) throws Exception {

        BufferedReader input = new BufferedReader(new InputStreamReader((System.in)));
        PrintWriter out = new PrintWriter(System.out);

        int t = Integer.parseInt(input.readLine().trim());
        while (t-- > 0) {
            String[] arr = input.readLine().split(" ");
            long a = Long.parseLong(arr[0]);
            long b = Long.parseLong(arr[1]);
            out.println(max(a, b));
        }
        input.close();
        out.flush();
    }

    static long max(long a, long b) {
        if (b - a == 1)
            return (b & a);
        else if ((b & 1) == 0)
            return ((b - 1) & (b - 2));
        else
            return (b & (b - 1));

    }
}
