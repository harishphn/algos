public class MyQueue<T>
{
	private static class QueueNode<T>
	{
		private T data;
		private QueueNode<T> next;

		public QueueNode(T data)
		{
			this.data = data;
		}
	}

	private QueueNode<T> first;
	private QueueNode<T> last;

	public void add(T item)
	{
		QueueNode<T> newNode = new  QueueNode<T>(item);
		if(last!=null)
		{
			last.next = newNode;
		}
		last = newNode;
		if(first==null)
		{
			first = last;
		}
	}

	public T remove()
	{
		if(first!=null)
		{
			T item = first.data;
			first = first.next;
		}
		if(first==null)
		{
			last = null;
		}

		return data;
	}

	public T peek()
	{
		if(first!=null)
		{
			return first.data;
		}
	}

	public boolean isEmpty()
	{
		return first == null;
	}
}