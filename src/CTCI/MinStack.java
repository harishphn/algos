import java.util.Scanner;

public class MinStack {
    public static void main(String args[]) {
        MyStack<Integer> stk = new MyStack<Integer>();
        MyStack<Integer> minStk = new MyStack<Integer>();
        Scanner scan = new Scanner(System.in);
        int choice = -1;
        try {
            do {
                System.out.println("1.Add   2.Remove   3.Print Current Min   4.Quit");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        int num = scan.nextInt();
                        stk.push(num);
                        if (minStk.isEmpty()) {
                            minStk.push(num);
                        } else if (minStk.peek() > num) {
                            minStk.push(num);
                        }
                        break;
                    case 2:
                        int pop = stk.pop();
                        if (minStk.peek() == pop) {
                            minStk.pop();
                        }
                        break;
                    case 3:
                        System.out.println("Current min: " + minStk.peek());
                        break;
                }
            } while (choice != 4);
        }
        catch (Exception ex) {
            System.out.println(ex);
        }
    }
}