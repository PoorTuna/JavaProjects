import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;
public class question3LotteryThing
{


	public static void main(String[] args)
	{
		int xd = 0;
		int count = 0;
		Random rnd = new Random();
		Scanner in =  new Scanner(System.in);
		
		System.out.println("please insert how many cells you would like in the following array! [int]");
		int decision = in.nextInt();
		
		
		int[] n1 = new int[decision];
		
		
		for ( int i = 0 ; i < n1.length ; i++)
		{
			int number = rnd.nextInt(30) + 1 ;
			for (int x = 0 ; x < n1.length ; x++)
			{
				if(number == n1[x])
				{
					count++;
				}
			}
			
			if ((number != n1[i]) && (count == 0) )
			{
				n1[i] = number;
			}
			else{
				System.out.println(number);
			}
			count = 0;
		}
		
	System.out.println(Arrays.toString(n1));
		
		
		
		
	}

}
