import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < n; i++){
            list.add(sc.nextInt());
        }

        int query = sc.nextInt();

        for(int i = 0; i < query; i++){

            String cmd = sc.next();

            if (cmd.equals("Insert")) {
                int index = sc.nextInt();
                int value = sc.nextInt();
                list.add(index, value);
            }
            else if (cmd.equals("Delete")) {
                int index = sc.nextInt();
                list.remove(index);
            }
        }

        for(int i = 0; i < list.size(); i++){
            System.out.print(list.get(i) + " ");
        }

        sc.close();
    }


}
