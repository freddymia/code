package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 
 * Given an array of N elements, check if it is possible to obtain a sum of S,
 * by choosing some (or none) elements of the array and adding them.
 * 
 * Input: First line of the input contains number of test cases T. Each test
 * case has three lines. First line has N, the number of elements in array.
 * Second line contains N space separated integers denoting the elements of the
 * array. Third line contains a single integer denoting S.
 * 
 * Output: For each test case, print "YES" if S can be obtained by choosing
 * some(or none) elements of the array and adding them. Otherwise Print "NO".
 * 
 * Note that 0 can always be obtained by choosing none.
 * 
 * Constraints 1 ≤ T ≤10 1 ≤ N ≤ 15 -10^6 ≤ A[i] ≤ 10^6 for 0 ≤ i < N
 *
 */
public class SumOfNumbersSolve {

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static boolean flag = false;

    public static void main(String[] args) throws java.lang.Exception {

        int t = Integer.parseInt(br.readLine());

        for (; t != 0; t--) {

            flag = false;

            int n = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());

            int i, arr[] = new int[n];

            for (i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int s = Integer.parseInt(br.readLine());

            if (s == 0) {
                System.out.println("YES");
                continue;
            }

            check(0, 0, arr, s, "0");

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    public static void check(int totalSum, int index, int arr[], int result, String nivel) {

        if (nivel.equals("0")) {
            System.out.println("index: " + index + " totalSum: " + totalSum);
        } else if (nivel.equals("1")) {
            System.out.println("\tindex: " + index + " totalSum: " + totalSum);
        } else if (nivel.equals("2")) {
            System.out.println("\t\tindex: " + index + " totalSum: " + totalSum);
        }

        if (totalSum == result) {
            flag = true;
        }

        if (index < arr.length) {
            check(totalSum + arr[index], index + 1, arr, result, "1");
            check(totalSum, index + 1, arr, result, "2");
        }

    }

}