import java.util.HashSet;

class LinkedListIntersectionPoint {
    int FindMergeNode(Node<Integer> headA, Node<Integer> headB) {
        // Complete this function
        // Do not write the main method. 
        HashSet<Node<Integer>> hset = new HashSet<Node<Integer>>();
        Node<Integer> cur = headA;
        while (cur != null) {
            hset.add(cur);
            cur = cur.next;
        }
        cur = headB;
        while (cur != null) {
            if (!hset.add(cur)) {
                return cur.data;
            }
            cur = cur.next;
        }

        return -1;

    }
}