package org.example.task1;

public class StringUtils {

    public boolean isPalindrome(String input) {
        if (input == null) {
            return false;
        }

        String low = input.toLowerCase();
        return low.contentEquals(new StringBuilder(low).reverse());
    }

    public int countVowels(String input) {
        if (input == null) {
            return 0;
        }

        return input.replaceAll("[^aeuioAEUIO]", "").length();
    }
}
