import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DuplicateWords {

    public static void main(String[] args) {

        // 1. Regex to find consecutive duplicate words
        String regex = "\\b(\\w+)(\\s+\\1\\b)+";

        // 2. Case-insensitive pattern
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);

        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());

        while (numSentences-- > 0) {
            String input = in.nextLine();

            Matcher m = p.matcher(input);

            // 3. Replace duplicate words with the first occurrence
            while (m.find()) {
                input = input.replaceAll(regex, "$1");
            }

            // Print result
            System.out.println(input);
        }

        in.close();
    }
}
