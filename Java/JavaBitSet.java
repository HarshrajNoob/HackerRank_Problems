import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        BitSet B1 = new BitSet(N);
        BitSet B2 = new BitSet(N);

        for (int i = 0; i < M; i++) {

            String operation = sc.next();
            int setNumber = sc.nextInt();
            int index = sc.nextInt();

            BitSet first = (setNumber == 1) ? B1 : B2;
            BitSet second = (index == 1) ? B1 : B2;

            switch (operation) {

                case "AND":
                    first.and(second);
                    break;

                case "OR":
                    first.or(second);
                    break;

                case "XOR":
                    first.xor(second);
                    break;

                case "FLIP":
                    first.flip(index);
                    break;

                case "SET":
                    first.set(index);
                    break;
            }

            System.out.println(B1.cardinality() + " " + B2.cardinality());
        }

        sc.close();
    }
}
