package ec.codemonk.basics.bit.manipulation;

import java.util.Scanner;

public class MaximumAND2 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while (t-- > 0) {

            long a = s.nextLong();
            long b = s.nextLong();

            System.out.println(pair(a, b));
        }

        s.close();
    }

    static long pair(long a, long b) {
        long result = 0;
        while (a < b) {
            for (long x = a; x < b; x++) {
                long value = x & b;
                if (value > result) {
                    result = value;
                }
            }
            b--;
        }
        return result;
    }

}
