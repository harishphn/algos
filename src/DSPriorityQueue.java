import java.util.PriorityQueue;

public class DSPriorityQueue {
    public static void main(String[] args) {

		/*
		PriorityQueue doesn’t allow null
		We can’t create PriorityQueue of Objects that are non-comparable
		The elements of the priority queue are ordered according to their natural ordering, 
		or by a Comparator provided at queue construction time, depending on which constructor is used.
		
		The head of this queue is the least element with respect to the specified ordering. 
		If multiple elements are tied for least value, 
		the head is one of those elements — ties are broken arbitrarily.
		
		The queue retrieval operations poll, remove, peek, and element access the element at the head of the queue.
		It inherits methods from AbstractQueue, AbstractCollection, Collection and Object class.
		*/

        //PriorityQueue
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(77);
        pq.add(34);
        pq.add(111);
        pq.add(67);
        while (pq.peek() != null) {
            System.out.print(pq.poll() + " ");
        }
        System.out.println();
    }
}