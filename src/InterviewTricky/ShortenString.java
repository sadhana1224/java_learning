package InterviewTricky;

import java.util.Scanner;

public class ShortenString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input");
        String input = scanner.next();
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            int len = result.length();
            if (len > 0 && result.charAt(len - 1) == ch) {
                result.deleteCharAt(len - 1);
            } else {
                result.append(ch);
            }
        }

        if (result.length() == 0) {
            System.out.println("-1");
        } else {
            System.out.println(result.toString());
        }
    }
}
