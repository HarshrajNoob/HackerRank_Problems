import java.io.*;
import java.util.*;
import java.security.*;

public class Solution {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            String input = sc.nextLine();

            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(input.getBytes());

            byte[] digest = md.digest();

            StringBuilder hex = new StringBuilder();
            for (byte b : digest) {
                hex.append(String.format("%02x", b));
            }

            System.out.println(hex.toString());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
