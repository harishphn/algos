import java.util.Scanner;

class SortStackNoRecursionExtraStack {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        MyStack<Integer> stk = new MyStack<Integer>();

        System.out.println("Enter numbers. Enter -1 to stop.");

        int num = scan.nextInt();
        while (num != -1) {
            stk.push(num);
            num = scan.nextInt();
        }
        try {
            sortStack(stk);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }

    }

    public static void display(MyStack<Integer> stk) {
        try {
            while (!stk.isEmpty()) {
                System.out.print(stk.pop() + " ");
            }
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
        System.out.println();
    }

    public static void sortStack(MyStack<Integer> stk) throws Exception {
        MyStack<Integer> tempStk = new MyStack<Integer>();
        while (!stk.isEmpty()) {
            if (tempStk.isEmpty()) {
                tempStk.push(stk.pop());
            } else if (tempStk.peek() < stk.peek()) {
                int num = stk.pop();
                while ((!tempStk.isEmpty()) && tempStk.peek() < num) {
                    stk.push(tempStk.pop());
                }
                tempStk.push(num);
            } else {
                tempStk.push(stk.pop());
            }
        }
        display(tempStk);
    }

}