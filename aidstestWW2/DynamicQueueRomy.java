import unit4.collectionsLib.*;
public class DynamicQueueRomy<T>
{
	private Node<T> front;
	private Node<T> rear;
	
	public DynamicQueueRomy()
	{
		this.front = null;
		this.rear = null;
	}
	
	public boolean isEmpty()
	{
		return this.front == null;
	}
	
	public void insert ( T value)
	{
		Node<T> temp = new Node<T>(value);
		if (this.front == null)
		{
			this.rear = temp;
			this.front = temp;
		}
		else{
			this.rear.setNext(temp);
			this.rear = temp;
		}
		
	}
	
	public Node<T> remove()
	{
		Node<T> temp = this.front;
		if (this.front == null)
		{
			return null;
		}
		else{
			this.front = this.front.getNext();
			return temp;
		}
	}
	
	public Node<T> head()
	{
		return this.front;
	}
	
	public String toString()
	{
		String s1 = "";
		Node<T> temp = this.front;
		while( temp != null)
		{
			s1 += temp.getInfo() + ",";
			temp = temp.getNext();
		}
		return s1;
	}
	
	
}
