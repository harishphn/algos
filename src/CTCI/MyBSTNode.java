import java.util.*;

class MyBSTNode<T extends Comparable<T>>
{
	MyBSTNode<T> left;
	MyBSTNode<T> right;
	T data;

	public MyBSTNode(T data)
	{
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public void insert(T value)
	{
		if(value.compareTo(data)<0)
		{
			if(left==null)
			{
				left = new MyBSTNode<T>(value);
			}
			else
			{
				left.insert(value);
			}
		}
		else if(value.compareTo(data)>0)
		{
			if(right==null)
			{
				right = new MyBSTNode<T>(value);
			}
			else
			{
				right.insert(value);
			}
		}
		else
		{
			//exception. BST does not allow duplicate values.
		}
	}

	public boolean contains(T value)
	{
		if(value.compareTo(data)==0)
		{
			return true;
		}
		else if(value.compareTo(data)<0)
		{
			return (left==null)?false:left.contains(value);
		}
		else
		{
			return (right==null)?false:right.contains(value);	
		}
	}

	public void printInOrder()
	{
		if(left!=null)
		{
			left.printInOrder();
		}
		System.out.println(data);
		if(right!=null)
		{
			right.printInOrder();
		}
	}
}