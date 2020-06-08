import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class DSArrayClassAndCollectionAlgorithms {
    public static void main(String[] args) {
        //CollectionAlgorithms
        LinkedList<Integer> la = new LinkedList<Integer>();
        la.add(-8);
        la.add(20);
        la.add(-20);
        la.add(8);

        Comparator<Integer> r = Collections.reverseOrder();
        la.sort(r);

        System.out.print("List sorted in reverse order: ");
        for (int i : la) {
            System.out.print(i + " ");
        }
        System.out.println();

        Collections.shuffle(la);
        System.out.print("Shuffled list: ");
        for (int i : la) {
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Minimum: " + Collections.min(la));
        System.out.println("Maximum: " + Collections.max(la));

        //Arrays class
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = -3 * i;
        }

        System.out.print("Original Contents: ");
        display(array);
        Arrays.sort(array);
        System.out.print("Sorted: ");
        display(array);

        Arrays.fill(array, 2, 6, -1);
        System.out.print("After fill(): ");
        display(array);

        Arrays.sort(array);
        System.out.print("After sorting again: ");
        display(array);

        System.out.print("The value -9 is at location ");
        int index = Arrays.binarySearch(array, -9);
        System.out.println(index);
    }

    public static void display(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}