package ec.codemonk.basics.bit.manipulation;

import java.util.Scanner;

public class MaximumAND {

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
                int value = operationAND(x, b);
                if (value > result) {
                    result = value;
                }
            }
            b--;
        }
        return result;
    }

    public static int operationAND(long a, long b) {

        String ba = new StringBuilder(decimalToBinary(a)).reverse().toString();
        String bb = new StringBuilder(decimalToBinary(b)).reverse().toString();
        StringBuilder result = new StringBuilder();

        int size = (ba.length() > bb.length()) ? ba.length() : bb.length();

        for (int i = 0; i < size; i++) {
            int bA = Character.getNumericValue((i < ba.length()) ? ba.charAt(i) : '0');
            int bB = Character.getNumericValue((i < bb.length()) ? bb.charAt(i) : '0');
            result.append(String.valueOf((bA * bB)));
        }

        return Integer.parseInt(result.reverse().toString(), 2);
    }

    public static String decimalToBinary(long decimal) {

        long value = decimal;
        StringBuilder binary = new StringBuilder();

        if (value > 0) {
            while (value > 0) {

                binary.append(value % 2);
                value = value / 2;
            }
        } else {
            binary.append(decimal);
        }

        return binary.reverse().toString();
    }

}
