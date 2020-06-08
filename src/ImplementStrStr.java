import java.util.Scanner;

public class ImplementStrStr {


    public static int strStr(String haystack, String needle) {

        if (haystack.isEmpty() && needle.isEmpty()) {
            return 0;
        }
        if (needle.isEmpty()) {
            return 0;
        }
        if (haystack.length() < needle.length()) {
            return -1;
        }
        if (haystack.equals(needle)) {
            return 0;
        }

        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j = i + 1;
                int count = 1;
                int k = 1;
                while (k < needle.length() && haystack.charAt(j) == needle.charAt(k)) {
                    count++;
                    j++;
                    k++;
                }
                if (count == needle.length()) {
                    return i;
                }
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter haystack and needle");
        String h = scan.next();
        String n = scan.next();

        System.out.println("Need in haystack: " + strStr(h, n));

    }
}

/*



 * */
