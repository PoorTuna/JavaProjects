import unit4.collectionsLib.Node;

public class Circlelist<T>
{
private Node<T>first;
public Circlelist()
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
public String toString()
{
    Node<T> p = this.first;
    String s = "";
    while(p!=null)
    {
        s += p.getInfo().toString();
        p = p.getNext();
    }
    return s;
}
}