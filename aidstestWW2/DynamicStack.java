import unit4.collectionsLib.*;

public class DynamicStack<T>
{
	private Node<T> top;
	
	public DynamicStack()
	{
		this.top = null;
	}
	
	public boolean isEmpty()
	{
		return this.top == null;
	}
	
	public void push(T value)
	{
		Node<T> temp = new Node<T>(value);
		temp.setNext(this.top);
		this.top = temp;
	}
	
	public Node<T> pop()
	{
		Node<T> temp = this.top;
		if (this.top == null)
		{
			temp = null;
		}
		else{
			
		
		temp = temp.getNext();
		}
		return temp;
	}
	
	public String toString()
	{
		String s1 = "";
		Node<T> temp = this.top;
		while ( temp != null)
		{
			s1 += temp.getInfo() + " , ";
			temp = temp.getNext();
		}
		
		return s1;
	}
}

