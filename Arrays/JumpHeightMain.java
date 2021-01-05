import java.util.Scanner;
public class JumpHeightMain
{


	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		jumpHeight p1 = new jumpHeight();
		
		System.out.println("Please insert the name of the contestant");
		String contestant = in.nextLine();
		p1.setName(contestant);
		
		for ( int i = 0 ; i < 5 ; i++)
		{
			System.out.println("Please enter the " + (i+1) + " time.");
			double time = in.nextDouble();
			p1.setTime(time);
		}
		System.out.println(p1.getResult());
		
		
		
	}

}
