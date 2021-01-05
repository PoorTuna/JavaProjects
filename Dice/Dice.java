import java.util.Random;
public class Dice
{
	private int turn_1 = 1;
	private int turn_2 = 1;
	private int total_score = 0;
	
	
	public Dice(int turn_1, int turn_2)
	{
		this.turn_1 = turn_1;
		this.turn_2 = turn_2;

	}
	
	public Dice()
	{
		this.turn_1 = 1;
		this.turn_2 = 1;
	}
	
	
	public int getScore()
	{
		return this.total_score;
	}
	
	public int rollDice_1()
	{
		Random rnd = new Random();
		this.turn_1 = rnd.nextInt(7)+1;
		return this.turn_1;
	}
	
	public int rollDice_2()
	{
		Random rnd = new Random();
		this.turn_2 = rnd.nextInt(7)+1;
		return this.turn_2;
	}
	
	public void addScore()
	{
		this.total_score += rollDice_2() + rollDice_1() ;
	}
	
	public boolean isDouble()
	{
		return (this.turn_2 == this.turn_1);	
	}
	

}
