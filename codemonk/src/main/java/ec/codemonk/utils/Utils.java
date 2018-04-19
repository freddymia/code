package ec.codemonk.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Utils {

    public static void main(String[] args) {

        long value = 8718821119L;

        // System.out.println(decimalToBinary(value));
        // System.out.println(decimalToBinaryLONG(value));// 8718821119
        // System.out.println(Long.toBinaryString(value));

        // printBinaryform(7897);
        // System.out.println("\n");
        // System.out.println(binaryToDecimalv1("1111011011001"));
        // shiftOperator();

    }

    public static void operatorAND(long a, long b) {
        String sa = Long.toBinaryString(a);
        String sb = Long.toBinaryString(b);
    }

    public static void shiftOperator() {
        int a = 52;
        int r = a >> 1;
        int s = r >> 1;
        int t = s >> 1;
        System.out.println(decimalToBinary(a) + " : " + a);
        System.out.println(decimalToBinary(r) + " : " + r);
        System.out.println(decimalToBinary(s) + " : " + s);
        System.out.println(decimalToBinary(s) + " : " + t);
    }

    static void pair(int a, int b) {

        while (a < b) {
            for (int x = a; x < b; x++) {
                System.out.println(x + " : " + b);
            }
            b--;
        }
    }

    public static int operationAND(int a, int b) {

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

    public static String decimalToBinaryLONG(long decimal) {

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

    public static String decimalToBinary(int decimal) {

        int value = decimal;
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

    public static int binaryToDecimal(String binary) {
        return Integer.parseInt(binary, 2);

    }

    public static int binaryToDecimalv1(String binary) {

        int l = binary.length();
        int decimal = 0;
        int i = 0;
        while (l-- > 0) {
            if (binary.charAt(i) == '1') {
                decimal += (int) Math.pow(2, l);
            }
            i++;
        }
        return decimal;
    }

    private static void printBinaryform(int number) {
        int remainder;
        if (number <= 1) {
            return; // KICK OUT OF THE RECURSION
        }
        remainder = number % 2;
        printBinaryform(number >> 1);
        System.out.print(remainder);
    }

    static void remainder(int a) {
        System.out.println("a%b: " + a % 2);
    }

    static void treeSet() {

        List<String> listString = new ArrayList<String>();
        listString.add("dog");
        listString.add("Zoo");
        listString.add("T-Rex");
        listString.add("Dog");
        listString.add("Dog");
        listString.add("Cat");
        listString.add("cAt");

        TreeSet<String> ts = new TreeSet<String>(listString);

        for (String string : ts) {
            System.out.println(string);
        }
    }

}
