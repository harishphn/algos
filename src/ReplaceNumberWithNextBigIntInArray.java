import java.util.ArrayDeque;
import java.util.Scanner;

public class ReplaceNumberWithNextBigIntInArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter array size");
        int a = scan.nextInt();
        int[] arr = new int[a];
        System.out.println("Enter array elements");
        for (int i = 0; i < a; i++) {
            arr[i] = scan.nextInt();
        }
        replace(arr);
        for (int i = 0; i < a; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void replace(int[] a) {
        ArrayDeque<Integer> st = new ArrayDeque<Integer>();
        st.push(a[a.length - 1]);
        for (int i = a.length - 2; i >= 0; i--) {
            int curr = a[i];
            if (curr < st.peek()) {
                a[i] = st.peek();
                st.push(curr);
            } else {
                while (st.peek() != null && curr > st.peek()) {
                    st.pop();
                }
                if (st.peek() != null) {
                    a[i] = st.peek();

                }
                st.push(curr);
            }
        }
    }
}