import unit4.collectionsLib.*;
public class DynamicQueue<T>
{

	private Node<T> rear;
	private Node<T> front;
	
	public DynamicQueue()
	{
		this.rear = null;
		this.front = null;
		
	}
	
	
	// mf actions yas bby.
	public Node Head()
	{
		return this.front;
	}
	
	public boolean isEmpty()
	{
		return (this.front == null) ;
	}
	
	public void insert( T para )
	{
		Node<T> temp = new Node(para);

		if ( this.front == null )
		{
			this.front = temp; // temp
			this.rear = temp;
		}
		else
		{
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
		this.front = this.front.getNext();
		if ( this.front == null)
		{
			this.rear = null;
		}
		return temp;
	}
	
	public String toString()
	{
		Node<T> temp = this.front;
		String s1 = "";
		while ( temp != null)
			{
			s1 += temp.getInfo() + " , ";
			temp = temp.getNext();
			}
		return s1;
	}
	
}
