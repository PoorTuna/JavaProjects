import java.util.Scanner;
public class runnerstime
{

	public static int elapsedTime(int first,int second)
	{
		int minutesElapsed = 0 ;
		minutesElapsed += ( ( (second / 100) - (first / 100) ) * 60 ) + ( second % 100 ) - ( first % 100) ;
		
		return minutesElapsed;
	}
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int best_time = Integer.MAX_VALUE;
		int best_contestant = 0;
		for ( int i  = 1 ; i <= 127 ; i++ )
		{
			System.out.println("Please enter the time of begining  contestant number " + i);
			int first_input = in.nextInt();
			System.out.println("Please enter the time of finishing  contestant number " + i);
			int second_input = in.nextInt();
			int run_duration = elapsedTime(first_input,second_input);
			if (run_duration < best_time)
			{
				best_time = run_duration;
				best_contestant = i;
			}
			
		}
		
	    System.out.println("The winner is contestant number" + best_contestant + " with the time of " + best_time);
	    
	}

}
