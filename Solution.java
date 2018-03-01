package StrongPasswordChecker;

public class Solution {

    static int strongPasswordChecker(String s) {
        System.out.println("string length is: " + s.length());
        boolean lower = false;
        boolean upper = false;
        boolean digit = false;
        int num = 0;
        int num1 = 0;
        if (s.length() < 6) {
            if (s.length() == 0) {
                return 6;
            }
            num1 = 6 - s.length();
        }
        if (s.length() > 20) {
            num1 = s.length() - 20;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                lower = true;
            }
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                upper = true;
            }
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                digit = true;
            }
        }
        for (int i = 0; i < s.length() - 2; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == s.charAt(i + 2)) {
                num++;
                i++;
                i++;
            }
        }
        if (!lower) {
            num++;
        }
        if (!upper) {
            num++;
        }
        if (!digit) {
            num++;
        }
        if (s.length() < 6) {
            return num1;
        }
        if (s.length() > 20) {
            return num1 + num;
        }
        return num + num1;
    }
}
