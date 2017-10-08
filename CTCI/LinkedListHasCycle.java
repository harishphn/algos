/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
    HashSet<Node> hset = new HashSet<Node>();
    if(head == null)
    {
        return false;
    }
    Node cur = head;
    while(cur!=null)
    {
        if(!hset.add(cur))
        {
            return true;
        }
        cur = cur.next;
    }
    return false;
}
