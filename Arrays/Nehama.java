
public class Nehama
{
	private double[] Hgrades = new double[20];
	private double[] Mgrades = new double[20];
	private String studentName;
	private int count  = 0;
	private int count2 = 0;
	private int count3 = 0;
	private String sum = "";
	
	
	public NehamaZona()
	{
		for ( int i = 0 ; i < this.Mgrades.length ; i++ )
		{
			this.Mgrades[i] = 0;
		}
		
		for ( int i = 0 ; i < this.Hgrades.length ; i++ )
		{
			this.Hgrades[i] = 0;
		}
		

		this.studentName = "";
		
	}
	
	public void setName(String name)
	{
		this.studentName = name;
	}
	
	
	public void setHebrew(double grade)
	{
		this.Hgrades[this.count] = grade;
		this.count++;
	}
	
	public void setMath(double grade2)
	{
		this.Mgrades[this.count2] = grade2;
		this.count2++;
	}
	
	public String getResult()
	{
		return this.sum;
	}
	
	public void doResult()
	{
			this.sum = this.sum + " [" + this.studentName + "," +this.Mgrades[this.count3] + " "+ this.Hgrades[this.count3] + "] ";
			this.count3++;
	}

}
