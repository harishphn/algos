import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.*;


public class Test {
    public static void main(String args[]) {
        int choice;
        do {
            System.out.println("1. Binary Search \n2. Find Missing Number. \n3. Search Rotated Array. \n4. Selection Sort \n5. Bubble Sort\n6. LCS\n7. byteLandianGold to USD\n8. Fibanocci\n9. MinCost Path\n10. Subset Sum\n11. Java Collections\n13. Merge Sort\n100. Exit\nYour Choice: ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextInt();
            int search;
            switch (choice) {
                case 11:
                    //Java collections. All data structures and some algorithms supported by Java collections.
                    javaColls();
                    break;
                case 12:
                    //DP: Longest Increasing Subsequence
                    break;
                case 13:
                    int[] numbers = getArray();
                    display(mergesort(numbers, 0, numbers.length - 1));
                    break;
                case 14:
                    //Sorting: Quick Sort
                    int[] qnumbers = getArray();
                    quicksort(qnumbers, 0, qnumbers.length - 1);
                    display(qnumbers);
                    break;
                case 15:
                    //Sorting: Heap Sort (Binary Heap)
                    int[] hnumbers = getArray();
                    heapsort(hnumbers, hnumbers.length);
                    display(hnumbers);
                    break;
                case 16:
                    //tic tac toe game
                    tictactoe();
                    break;
                case 17:
                    //connect 4 game
                    break;
                case 18:
                    //File IO
                    fileIO();
                    break;
                case 19:
                    //Prime Number
                    System.out.println("Enter a number");
                    int pri = scan.nextInt();
                    if (isPrime(pri)) {
                        System.out.println("Prime!");
                    } else {
                        System.out.println("Not Prime!");
                    }
                case 20:
                    System.out.println("Enter a number");
                    int pow = scan.nextInt();
                    powerOf2(pow);

                case 21:
                    //BST
                    //Heap
                case 22:
                    arraysAndStrings();
                    break;
            }
        } while (choice != 100);
    }

    public static void display(int[] nums) {
        for (int x : nums) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] getArray() {
        System.out.println("Enter the size of array");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println("Enter the numbers");
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scan.nextInt();
        }
        return nums;
    }


    public static void subSetSum(int[] set, int sum) {

    }

    public static int[] mergesort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            int[] leftArr = mergesort(nums, left, mid);
            int[] rightArr = mergesort(nums, mid + 1, right);
            return merge(leftArr, rightArr);
        } else {
            int[] num = new int[1];
            num[0] = nums[left];
            return num;
        }
    }

    public static int[] merge(int[] left, int[] right) {
        int[] res = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        for (i = 0, j = 0, k = 0; i < left.length && j < right.length; ) {
            if (left[i] < right[j]) {
                res[k] = left[i];
                i++;
                k++;
            } else {
                res[k] = right[j];
                j++;
                k++;
            }
        }

        for (int p = i; p < left.length; p++) {
            res[k] = left[p];
            k++;
        }

        for (int p = j; p < right.length; p++) {
            res[k] = right[p];
            k++;
        }

        return res;

    }

    public static void quicksort(int[] nums, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            int x = nums[mid];
            int i = left;
            int j = right;
            do {
                while (nums[i] < x) {
                    i++;
                }
                while (nums[j] > x) {
                    j--;
                }
                if (i <= j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    i++;
                    j--;
                }
            } while (i <= j);
            if (left < j) {
                quicksort(nums, left, j);
            }
            if (i < right) {
                quicksort(nums, i, right);
            }
        }
    }

    public static void heapsort(int[] nums, int n) {
		/*
		First heapify (either max or min) non-leaf nodes. last non-leaf node is n/2 - 1. 
		Then, you will have the max/min element at the root position, now swap it with the last leaf element and heapify remaining elements.
		This will put the max/min element in the last position of the array.
		continue this process until there are no elements in heap.
		*/
        for (int i = (n / 2) - 1; i >= 0; i--) {
            heapify(nums, n, i);
        }

        for (int i = n - 1; i >= 0; i--) {
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;

            heapify(nums, i, 0);
        }
    }

    public static void heapify(int[] nums, int n, int i) {
        int left = (2 * i) + 1;
        int right = (2 * i) + 2;
        int largest = i;
        if (left < n && nums[left] > nums[i]) {
            largest = left;
        }
        if (right < n && nums[right] > nums[i]) {
            largest = right;
        }
        if (largest != i) {
            int temp = nums[largest];
            nums[largest] = nums[i];
            nums[i] = temp;

            heapify(nums, n, largest);
        }
    }


    public static void javaColls() {

        //HashMap - a hash table with unique keys. <key, value>
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("John Reese", new Double(3.14));
        hm.put("Neal Caffrey", new Double(1.43));
        hm.put("John Snow", new Double(1.00));
        hm.put("Ross Geller", new Double(1.11));

        Set<Map.Entry<String, Double>> set = hm.entrySet();
        for (Map.Entry<String, Double> entry : set) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        hm.put("Ross Geller", hm.get("Ross Geller") + 1.0);
        System.out.println("Ross's new balance: " + hm.get("Ross Geller"));

        //TreeMap - It creates maps stored in a tree structure.
        //A TreeMap provides an efficient means of storing key/value pairs in sorted order and allows rapid retrieval.
        TreeMap<String, Double> tm = new TreeMap<String, Double>();
        tm.put("Ross Geller", new Double(1.11));
        tm.put("John Reese", new Double(3.14));
        tm.put("Neal Caffrey", new Double(1.43));
        tm.put("John Snow", new Double(1.00));

        Set<Map.Entry<String, Double>> tsset = tm.entrySet();
        for (Map.Entry<String, Double> entry : tsset) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        tm.put("Ross Geller", tm.get("Ross Geller") + 1.0);
        System.out.println("Ross's new balance: " + tm.get("Ross Geller"));

        //LinkedHashMap - It maintains a linked list of the entries in the map, in
        //the order in which they were inserted. This allows insertion-order iteration over the map.
        //You can also create a LinkedHashMap that returns its elements in the order in which they were last accessed
        LinkedHashMap<String, Double> lm = new LinkedHashMap<String, Double>();
        lm.put("Ross Geller", new Double(1.11));
        lm.put("John Reese", new Double(3.14));
        lm.put("Neal Caffrey", new Double(1.43));
        lm.put("John Snow", new Double(1.00));

        Set<Map.Entry<String, Double>> liset = lm.entrySet();
        for (Map.Entry<String, Double> entry : liset) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        lm.put("Ross Geller", lm.get("Ross Geller") + 1.0);
        System.out.println("Ross's new balance: " + lm.get("Ross Geller"));

        //CollectionAlgorithms
        LinkedList<Integer> la = new LinkedList<Integer>();
        la.add(-8);
        la.add(20);
        la.add(-20);
        la.add(8);

        Comparator<Integer> r = Collections.reverseOrder();
        Collections.sort(la, r);

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
        int array[] = new int[10];
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

    //Case18
    public static void fileIO() {
        try (BufferedReader reader = new BufferedReader(new FileReader("Test.java")); BufferedWriter writer = new BufferedWriter(new FileWriter("MyOut.java"))) {

            String line = "";
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
                writer.write(line);
                writer.newLine();
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }

    //case16
    public static void tictactoe() {
        //create a 3x3 array and initialize it with say -1
        //ask player 1 for his position in the matrix
        //mark that position as say x
        //display the matrix
        //ask player 2 for his position in the matrix
        //player 2 enters his position
        //check if the  entered position is a valid one - see if its not -1 and throw an error if its nor -1.

        int[][] matrix = new int[3][3];
        int freeSpaces = 9;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = -1;
            }
        }

        Scanner scan = new Scanner(System.in);

        int player = 1;
        boolean done = false;
        while (!done) {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (matrix[i][j] != -1) {
                        System.out.print("| " + matrix[i][j]);
                    } else {
                        System.out.print("| ");
                    }

                }
                System.out.println("|");
            }
            System.out.println("Player: " + player + " Enter the position in the form a,b ");
            String pos = scan.next();
            Scanner ext = new Scanner(pos).useDelimiter("\\s*,\\s*");
            int x = ext.nextInt();
            int y = ext.nextInt();
            x--;
            y--;
            if (matrix[x][y] != -1) {
                System.out.println("Invalid Move!");
            } else {
                matrix[x][y] = player;
                freeSpaces--;

                //check if a player has won
                boolean won = true;
                for (int k = 0; k < 3; k++) {

                    if (matrix[x][k] != player) {
                        System.out.println("Row" + matrix[x][k]);
                        won = false;
                    }
                }
                if (won) {
                    System.out.println("Congrats Player: " + player + ". You Won!");
                    done = true;
                }
                won = true;
                for (int k = 0; k < 3; k++) {

                    if (matrix[k][y] != player) {
                        System.out.println("Col" + matrix[k][y]);
                        won = false;
                    }
                }
                if (won) {
                    System.out.println("Congrats Player: " + player + ". You Won!");
                    done = true;
                }

                if (x == y) {
                    won = true;
                    for (int k = 0; k < 3; k++) {
                        if (matrix[k][k] != player) {
                            won = false;
                        }
                    }
                }

                if (won) {
                    System.out.println("Congrats Player: " + player + ". You Won!");
                    done = true;
                } else if (freeSpaces == 0) {
                    System.out.println("Game Drawn!");
                    done = true;
                }

                player = (player == 1) ? 2 : 1;
            }
        }


    }

    //Case19
    public static boolean isPrime(int n) {
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


    //case20
    public static void powerOf2(int n) {
        if (n < 1) {
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        int prev = 1;
        System.out.println(1);
        int cur;
        for (int i = 1; i <= n / 2; i++) {
            cur = prev * 2;
            if (cur <= n) {
                prev = cur;
                System.out.println(cur);
            } else {
                break;
            }
        }
    }

    public static void arraysAndStrings() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextInt();
        System.out.println("String is unique: " + isUnique());
    }

    public static void isUnique(String str) {

    }


}
