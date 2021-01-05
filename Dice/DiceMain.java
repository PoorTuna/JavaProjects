
public class DiceMain
{


	public static void main(String[] args)
	{
	Dice p1 = new Dice();
	Dice p2 = new Dice();
	
	p1.rollDice_1();
	p1.rollDice_2();
	if (p1.isDouble() == true)
	{
		p1.rollDice_1() = p1.rollDice_1()*2;
	}
	
	
	
	
	
	}

}
