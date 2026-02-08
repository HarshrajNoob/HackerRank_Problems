import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            BigInteger a = new BigInteger(br.readLine());
            BigInteger b = new BigInteger(br.readLine());

            System.out.println(a.add(b));
            System.out.println(a.multiply(b));

        } catch (IOException e) {
            // HackerRank will never reach here
        }
    }
}
