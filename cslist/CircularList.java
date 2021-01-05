import unit4.collectionsLib.Node;

public class CircularList<T>
{
private Node<T>first;
public CircularList()
{
    this.first=null;
}
public boolean isEmpty()
{
    return this.first == null;
}
public void insert(Node<T> p,T x)
{
    if(this.first==null)

        this.first = new Node<T>(x,this.first);
  else{ 
      Node<T> q = this.first;
        while(q.getNext()!=this.first)
            q = q.getNext();
        if(p == null){

            this.first= new Node<T>(x,this.first);
            q.setNext(this.first);
        }

        else{
            if(q==this.first)
            {
            q.setNext(new Node<T>(x,this.first));

            }
            else{
                p.setNext(new Node<T>(x,p.getNext()));
            }
        }
      }
} 

public void remove(Node<T> par)
{
	Node<T> temp = this.first;
	if ( ( this.first != null ) && ( par != null ) ){

	while (temp.getNext() != par){
	       par = par.getNext();
	}	

	par.setNext(par.getNext().getNext());

	}
}
public Node<T> getValue()
{
	return this.first;
}

public void setValue(Node<T> par)
{
	this.first = par;
}

public String toString()
{
    Node<T> temp = this.first;
    String string = "";
    while(temp.getNext()!= this.first)
    {
        string += temp.getInfo().toString();
        temp = temp.getNext();
    }
    string += temp.getInfo().toString();
    return string;
}


	public static void main(String[] args)
	{

	}

}
