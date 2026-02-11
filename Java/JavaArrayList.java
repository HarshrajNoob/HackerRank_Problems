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
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            list.add(new ArrayList<Integer>());
            int d = sc.nextInt();
            
            for(int j=0; j<d; j++){
                list.get(i).add(sc.nextInt());
            }
        }
        
        ArrayList<ArrayList<Integer>> query = new ArrayList<>();
        int q = sc.nextInt();
        for(int i=0; i<q; i++){
            query.add(new ArrayList<Integer>());
            
            for(int j=0; j<2; j++){
                query.get(i).add(sc.nextInt());
            }
        }
        
        for(int i=0; i<q; i++){
            try {
                System.out.println(list.get(query.get(i).get(0)-1).get(query.get(i).get(1)-1));
            } catch (Exception e) {
                System.out.println("ERROR!");
            }
        }
        sc.close();
    }
}
