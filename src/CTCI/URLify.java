package CTCI;
/*
Write a method to replace all the spaces in a string with ‘%20’. 
You may assume that the string has sufficient space at the end to hold the additional characters, 
and that you are given the true length of the string.

http://www.geeksforgeeks.org/urlify-given-string-replace-spaces/
*/

import java.util.Scanner;

public class URLify {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = scan.nextLine();
        System.out.println("Enter its true length");
        int trueLength = scan.nextInt();
        char[] sChars = str.toCharArray();
        int spaces = 0;
        for (int i = 0; i < trueLength; i++) {
            if (sChars[i] == ' ') {
                spaces++;
            }
        }
        int index = trueLength + spaces * 2;
        for (int i = trueLength - 1; i >= 0; i--) {
            if (sChars[i] == ' ') {
                sChars[index - 1] = '0';
                sChars[index - 2] = '2';
                sChars[index - 3] = '%';
                index -= 3;
            } else {
                sChars[index - 1] = sChars[i];
                index--;
            }
        }
        String s = new String(sChars);
        System.out.println(s);

        scan.close();
    }
}