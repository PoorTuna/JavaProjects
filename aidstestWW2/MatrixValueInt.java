
public class MatrixValueInt
{

	private int i;
	private int j;
	private int  value;
	
	
	
	// ********** Constructors  -  בנאים  **********
	
	public MatrixValueInt ()
	{
		this.i = 0;
		this.j = 0;
		this.value = 0l;
	}
	
	public MatrixValueInt (int i, int j, int x)
	{
		this.i = i;
		this.j = j;
		this.value = x;
	}

	public MatrixValueInt (MatrixValue mValue)
	{
		this.i = mValue.i;
		this.j = mValue.j;
		this.value = mValue.value;
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

	
	
	public int getValue()
	{
		return this.value;
	}

	public void setValue(int value)
	{
		this.value = value;
	}

	public boolean equals MatrixValueInt mValue)
	{
		return ((this.i == mValue.i) && (this.j == mValue.j)&& 
				(this.value ==  mValue.value));
	}


	public String toString ()
	{
		return ("(" + this.i + "," + this.j+") " + this.value );
	}
	
	
	public static void main(String[] args)
	{
		MatrixValueInt  mv = new MatrixValue(2,7,2007);
		System.out.println(mv.toString());
	}


}
