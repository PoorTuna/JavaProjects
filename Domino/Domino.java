
public class Domino
{
///////////////////////
private int right;
private int left;
	
///////////////////////
public Domino()
{
	this.right = 1;
	this.left = 1;
}

public Domino(int right , int left)
{
	this.right = right;
	this.left = left;
}	
	
public Domino(Domino Par)
{
	this.left = Par.left;
	this.right = Par.right;
}
/////////////////////////

public void setLeft(int left)
{
	this.left = left;
}

public void setRight(int right)
{
	this.right = right;	
}

public int getLeft()
{
	return this.left;
}

public int getRight()
{
	return this.right;
}
////////////////////////
public boolean isEqual(Domino par)
{
	
	if ((par.right==this.right) && (par.left == this.left))
		return true;
	else
		return false;
}

public boolean betterEqual(Domino par, Domino n)
{	if ((par.left == n.left) && (par.right == n.right))
		return true;
	else
		return false;
}
////////////////////////////

public String toString(String right , String left)
{
	return ("Left= "+left+" "+"Right= "+right);
}
/////////////////////////////

}
