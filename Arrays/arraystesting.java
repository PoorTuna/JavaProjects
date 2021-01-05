import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class arraystesting
{

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		int countZugi = 0 , countNotZugi = 0 ;
		int countTrue = 0 , countFalse = 0 ;
		
		System.out.println("Please insert how many cells you want in your arrays!");
		int decision = in.nextInt();
		
		int[] n1 = new int[decision];
		boolean[] b1 = new boolean[decision];
		boolean[] b2 = new boolean[decision];
		
		
		for ( int i = 0 ; i  < n1.length ; i++)
		{
			n1[i] = rnd.nextInt(100) + 1;
			if (n1[i]%2 == 0)
			{
				countZugi++;
			}
			else
			{
				countNotZugi++;
			}
		}
		System.out.println("Zugi = " + countZugi);
		System.out.println("Not Zugi = " + countNotZugi );
		
		for (int i = 0 ; i < b1.length ; i++)
		{
			b1[i] = rnd.nextBoolean();
			if (b1[i] == true)
			{
				countTrue++;
			}
			else
			{
				countFalse++;
			}
		}
		
		System.out.println("True = " + countTrue);
		System.out.println("False = " + countFalse);

		b2 = Arrays.copyOf(b1, 100);
		System.out.println(Arrays.toString(n1));
		System.out.println(Arrays.toString(b2));
		
		

		
		
	}

}
