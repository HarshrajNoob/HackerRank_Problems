import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
    // Step 1: Make comparison case-insensitive
    a = a.toLowerCase();
    b = b.toLowerCase();

    // Step 2: Length check
    if (a.length() != b.length()) {
        return false;
    }

    // Step 3: Frequency array for 26 lowercase letters
    int[] freq = new int[26];

    // Step 4: Count characters
    for (int i = 0; i < a.length(); i++) {
        freq[a.charAt(i) - 'a']++;
        freq[b.charAt(i) - 'a']--;
    }

    // Step 5: Verify all frequencies are zero
    for (int count : freq) {
        if (count != 0) {
            return false;
        }
    }

    return true;
}
    public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
