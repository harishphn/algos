public class MyStack<T> {
    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        public StackNode(T data) {
            this.data = data;
        }
    }

    private StackNode<T> top;

    public T pop() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        T item = top.data;
        top = top.next;
        return item;
    }

    public void push(T data) {
        StackNode<T> newNode = new StackNode<T>(data);
        newNode.next = null;

        if (top == null) {
            top = newNode;
        } else {
            newNode.next = top;
            top = newNode;
        }
    }

    public T peek() throws Exception {
        if (isEmpty()) {
            throw new Exception();
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

}