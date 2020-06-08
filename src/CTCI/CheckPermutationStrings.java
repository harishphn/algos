package CTCI;

import java.util.HashMap;
import java.util.Scanner;

public class CheckPermutationStrings {
    public static void main(String[] args) {
        //http://www.geeksforgeeks.org/check-whether-two-strings-are-anagram-of-each-other/
        System.out.println("Enter two strings");
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println("Strings are permutation: " + isAPermutation(str1, str2));
        scan.close();
    }

    public static boolean isAPermutation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> hmap = new HashMap<Character, Integer>();

        for (int i = 0; i < str1.length(); i++) {
            char ch = str1.charAt(i);
            if (hmap.containsKey(ch)) {
                hmap.put(ch, hmap.get(ch) + 1);
            } else {
                hmap.put(ch, 1);
            }
        }

        for (int i = 0; i < str2.length(); i++) {
            char ch = str2.charAt(i);
            if (!hmap.containsKey(ch)) {
                return false;
            } else {
                hmap.put(ch, hmap.get(ch) - 1);
                if (hmap.get(ch) < 0) {
                    return false;
                }
            }
        }

        return true;

    }
}