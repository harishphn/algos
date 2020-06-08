class BSTNode<T extends Comparable<T>> {
    BSTNode<T> left;
    BSTNode<T> right;
    T data;

    public BSTNode(T data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(T value) {
        if (value.compareTo(data) < 0) {
            if (left == null) {
                left = new BSTNode<T>(value);
            } else {
                left.insert(value);
            }
        } else if (value.compareTo(data) > 0) {
            if (right == null) {
                right = new BSTNode<T>(value);
            } else {
                right.insert(value);
            }
        } else {
            //exception. BST does not allow duplicate values.
        }
    }

    public boolean contains(T value) {
        if (value.compareTo(data) == 0) {
            return true;
        } else if (value.compareTo(data) < 0) {
            return (left != null) && left.contains(value);
        } else {
            return (right != null) && right.contains(value);
        }
    }

    public void printInOrder() {
        if (left != null) {
            left.printInOrder();
        }
        System.out.println(data);
        if (right != null) {
            right.printInOrder();
        }
    }
}