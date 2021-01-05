
public class jumpHeight
{
	private String playerName = "";
	private double[] timeResults = new double[5];
	private int count = 0;
	private double bestTime = Integer.MAX_VALUE;
	
	public void setName(String name)
	{
		this.playerName = name;
	}

	public String getName()
	{
		return this.playerName;
	}
	
	public void setTime(double time)
	{
		this.timeResults[this.count] = time;
		this.count ++;
	}
			
	public double getBestTime()
	{
		for ( int i = 0 ; i < this.timeResults.length ; i++)
		{
			if (this.timeResults[i] < this.bestTime)
			{
				this.bestTime = this.timeResults[i];
			}
		}
		return this.bestTime;
	}
	
	public String getResult()
	{
		return this.playerName + " , "  + this.getBestTime();
	}
	
}

