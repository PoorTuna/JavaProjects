
public class Position
{

	private int i;
	private int j;
	
	
	// ********** Constructors  -  בנאים  **********
	
	
	public Position()
	{
		this.i = 0;
		this.j = 0;
	}
	
	public Position(int i, int j)
	{
		this.i = i;
		this.j = j;
	}

	public Position(Position p)
	{
		this.i = p.i;
		this.j = p.j;
	}
	
	
	
	//	 ********** Get + Set  -  קביעה ואחזור  **********

	public int getI()
	{
		return this.i;
	}

	public void setI(int i)
	{
		this.i = i;
	}

	public int getJ()
	{
		return this.j;
	}

	public void setJ(int j)
	{
		this.j = j;
	}

	
	public boolean equals (Position p)
	{
		return ((this.i == p.i) && (this.j == p.j));
	}


	public String toString ()
	{
		return ("Positin: (" + this.i + "," + this.j+")");
	}
	
	
	public static void main(String[] args)
	{
		Position p = new Position(2,7);
		System.out.println(p.toString());
	}

}
