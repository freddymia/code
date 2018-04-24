package ec.codemonk.basics.bit.manipulation;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class SumOfNumbers {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String [n] strA = br.readLine().split("\\s");
            int s = Integer.parseInt(br.readLine());

            operator(new ArrayList<String>(strA), s);
        }

    }

    private static void operator(List<String> list, int S) {

        TreeSet<String> ts = new TreeSet<String>(list).descendingSet();

    }

}
