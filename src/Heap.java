import java.util.*;

abstract class Heap
{
	protected int capacity;
	protected int size;
	protected int[] items;

	public 	Heap()
	{
		this.capacity = 10;
		this.size = 0;
		this.items = new int[capacity];
	}

	public int getLeftChildIndex(int parentIndex)
	{
		return 2 * parentIndex + 1;
	}

	public int getRightChildIndex(int parentIndex)
	{
		return 2 * parentIndex + 2;
	}

	public int getParentIndex(int childIndex)
	{
		return (childIndex-1)/2;
	}

	public boolean hasLeftChild(int index)
	{
		return getLeftChildIndex(index) < size;
	}

	public boolean hasRightChild(int index)
	{
		return getRightChildIndex(index) < size;
	}

	public boolean hasParent(int index)
	{
		return getParentIndex(index) >=0 ;
	}

	public leftChild(int index)
	{
		return items[getLeftChildIndex(index)];
	}

	public rightChild(int index)
	{
		return items[getRightChildIndex(index)];
	}

	public parent(int index)
	{
		return items[getParentIndex(index)];
	}

	public void swap(int indexOne, int indexTwo)
	{
		int temp = items[indexOne];
		items[indexOne] = items[indexTwo];
		items[indexTwo] = temp;
	}

	public void ensureCapacity()
	{
		if(size==capacity)
		{
			capacity *= 2;
			items = Arrays.copyOf(items, capacity);
		}
	}

	public int peek()
	{
		if(size==0)
		{
			throw new IllegalStateException("empty heap");
		}
		return items[0];
	}

	public int poll()
	{
		if(size==0)
		{
			throw new IllegalStateException("empty heap");
		}

		int item = items[0];
		items[0] = items[size-1];
		size--;
		heapifyDown();
		return item;
	}

	public void add(int item)
	{
		ensureCapacity();
		items[size] = item;
		size++;
		heapifyUp();
	}

	public abstract void heapifyUp();

	public abstract void heapifyDown();

}

class MinHeap extends Heap
{
	public void heapifyDown()
	{
		int index=0;

		while(hasLeftChild(index))
		{
			int smallerChildIndex = getLeftChildIndex(index);

			if(hasRightChild(index) && rightChild(index) < leftChild(index))
			{
				smallerChildIndex = getRightChildIndex(index);
			}

			if(items[index] < items[smallerChildIndex])
			{
				break;
			}
			else
			{
				swap(index, smallerChildIndex);
			}
			index = smallerChildIndex;
		}
	}

	public void heapifyUp()
	{
		int index = size-1;

		while(hasParent(index) && parent(index) > items[index])
		{
			swap(index, getParentIndex(index));
			index = getParentIndex(index);
		}
	}
}