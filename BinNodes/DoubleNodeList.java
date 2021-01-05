import unit4.collectionsLib.*;
import unit4.utilsLib.BinTreeUtils;

public class DoubleNodeList<T>
{
	static BinNode first = new BinNode(null,null,null);
	
	
	public void Remove(BinNode<T> t1)
	{
		BinNode temp = first.getRight();
		while ( t1 != temp)
		{
			temp = temp.getRight();
		}
		temp.getLeft().setRight(temp.getRight());
		temp.getRight().setLeft(temp.getLeft());
	}
	
	public static void main(String[] args)
	{
		
	}

}