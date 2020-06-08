import java.util.Scanner;

public class NAryTreeTraversal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        TreeNode<Integer> root = new TreeNode<Integer>();
        System.out.println("Enter root data");
        int data = scan.nextInt();
        root.data = data;
        buildtree(root);
    }

    public static void buildtree(TreeNode<Integer> root) {
        System.out.println("Enter children for: " + root.data + ". Press -100 to stop");
        root.children = new ArrayList<TreeNode<T>>();
        int child = scan.nextInt();
        while (child != -100) {
            TreeNode<Integer> node = new TreeNode<Integer>();
            node.data = child;
            buildtree(node);
            root.children.add(node);
            child = scan.nextInt();
        }
        if (myroot == null) {
            myroot = root;
        }
    }
}