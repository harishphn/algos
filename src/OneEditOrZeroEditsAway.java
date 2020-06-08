import java.util.Scanner;

public class OneEditOrZeroEditsAway {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter string 1");
        String str1 = scan.next();
        System.out.println("Enter string 2");
        String str2 = scan.next();

        if (str1.length() == str2.length()) {
            System.out.println(checkReplace(str1, str2));
        } else if (str1.length() + 1 == str2.length()) {
            System.out.println(checkInsert(str1, str2));
        } else if (str1.length() - 1 == str2.length()) {
            System.out.println(checkInsert(str2, str1));
        } else {
            System.out.println("False");
        }
        scan.close();
    }

    public static boolean checkReplace(String str1, String str2) {
        int count = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (count >= 1) {
                    return false;
                }
                count++;
            }
        }

        return true;
    }

    public static boolean checkInsert(String str1, String str2) {
        for (int i = 0, j = 0; i < str1.length(); ) {
            if (str1.charAt(i) != str2.charAt(j)) {
                if (j - i >= 1) {
                    return false;
                }
                j++;
            } else {
                j++;
                i++;
            }
        }
        return true;
    }
}