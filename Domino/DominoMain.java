
public class DominoMain
{
	public static void main(String[] args)
	{
		Domino d1 = new Domino(3,4);
		Domino d2 = new Domino(7,8);
		Domino d3 = new Domino(1,3);
		Domino d4; // Just to prove that there are other ways to define an object.
		
		boolean check1=false,check2=false;
		
		System.out.println(d1.isEqual(d2));
		System.out.println(d1.isEqual(d3));
		System.out.println(d2.isEqual(d3));
		
		
		if ((d1.getRight() == d2.getLeft()) || (d1.getRight()+1== d2.getLeft()) || (d1.getRight()-1 == d2.getLeft()))
		{
			System.out.println("D1 and D2 may be a sequence");
			check1 = true;
		}
		else
			System.out.println("Invalid Sequence between D1 and D2.");
		
		if ((d2.getRight() == d3.getLeft()) ||(d2.getRight()+1 == d3.getLeft() || d2.getRight()-1 == d3.getLeft()))
		{
			System.out.println("D2 and D3 may be a sequence");
			check2 = true;
		}	
		else
			System.out.println("Invalid Sequence between D1 and D2.");
		if (check2 == check1 == true)
		{
		System.out.println("The domino sequence is valid.");	
		}
		
		if (check1 == false)
		{
			d1.setRight(d2.getLeft());
		}
		
		if (check2 == false)
		{
			d2.setRight(d3.getLeft());
		}
	
		System.out.println("Retrying the sequence procedure...");
		
/////
		if ((d1.getRight() == d2.getLeft()) || (d1.getRight()+1== d2.getLeft()) || (d1.getRight()-1 == d2.getLeft()))
		{
			System.out.println("D1 and D2 may be a sequence");
		}
		else
			System.out.println("Invalid Sequence between D1 and D2.");
		
		if ((d2.getRight() == d3.getLeft()) ||(d2.getRight()+1 == d3.getLeft() || d2.getRight()-1 == d3.getLeft()))
		{
			System.out.println("D2 and D3 may be a sequence");
		}	
		
		else
			System.out.println("Invalid Sequence between D1 and D2.");
		
		if (check2 == check1 == true)
		{
		System.out.println("The domino sequence is valid.");	
		}
		
////	
		
		
		
	}

}
