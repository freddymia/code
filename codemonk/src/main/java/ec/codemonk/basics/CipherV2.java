package ec.codemonk.basics;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CipherV2 {

    static final String STR_ALPHABET_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    static final String STR_ALPHABET_LOWER = "abcdefghijklmnopqrstuvwxyz";
    static final String STR_NUMBER = "0123456789";

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] messageChars = br.readLine().toCharArray();
        int k = Integer.parseInt(br.readLine());

        for (int i = 0; i < messageChars.length; i++) {
            System.out.print(getChar(messageChars[i], k));
        }

    }

    public static char getChar(char c, int k) {

        if (STR_ALPHABET_UPPER.contains(String.valueOf(c))) {
            return STR_ALPHABET_UPPER.charAt(getIndex(STR_ALPHABET_UPPER.indexOf(String.valueOf(c)), k, STR_ALPHABET_UPPER.length()));
        } else if (STR_ALPHABET_LOWER.contains(String.valueOf(c))) {
            return STR_ALPHABET_LOWER.charAt(getIndex(STR_ALPHABET_LOWER.indexOf(String.valueOf(c)), k, STR_ALPHABET_LOWER.length()));
        } else if (STR_NUMBER.contains(String.valueOf(c))) {
            return STR_NUMBER.charAt(getIndex(STR_NUMBER.indexOf(String.valueOf(c)), k, STR_NUMBER.length()));
        }

        return c;
    }

    public static int getIndex(int i, int k, int length) {

        int index = 0;

        if ((i + k) < length) {
            index = i + k;
        } else if ((i + k) > length) {
            int quotient = (i + k) / length;
            index = (i + k) - (quotient * length);
        }

        return index;
    }

}