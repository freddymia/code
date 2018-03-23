package ec.codemonk.basics;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountDigits {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String srt = s.next();

        int i = 0;
        while (i++ < 10) {
            
            Pattern pattern = Pattern.compile(String.valueOf(i));
            Matcher matcher = pattern.matcher(srt);
            
           // Map<String, Long> ocurrencias = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
            String
            

        }

        s.close();
    }

}
