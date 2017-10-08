import java.util.HashSet;

class LinkedListIntersectionPoint
{
	int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    HashSet<Node> hset = new HashSet<Node>();
    Node cur = headA;
    while(cur!=null)
    {
        hset.add(cur);
        cur = cur.next;
    }
    cur = headB;
    while(cur!=null)
    {
        if(!hset.add(cur))
        {
            return cur.data;
        }
        cur = cur.next;
    }

    return -1;

	}
}