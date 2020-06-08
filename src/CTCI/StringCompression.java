package CTCI;

import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.next();
        System.out.println(getCompressedString(str));
        scan.close();
    }

    public static String getCompressedString(String str) {
        StringBuilder sBldr = new StringBuilder();
        int count = 1;
        int i = 1;
        for (i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                sBldr.append(str.charAt(i - 1));
                sBldr.append(count);
                count = 1;
            }
        }
        //System.out.println(i);
        sBldr.append(str.charAt(i - 1));
        sBldr.append(count);
        String newStr = sBldr.toString();
        if (newStr.length() < str.length()) {
            return newStr;
        } else {
            return str;
        }
    }
}