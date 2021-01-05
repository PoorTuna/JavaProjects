
public class time
{

	public static int elapsedTime(int first,int second)
	{
		int minutesElapsed = 0 ;
		minutesElapsed += ( ( (second / 100) - (first / 100) ) * 60 ) + ( second % 100 ) - ( first % 100) ;
		
		return minutesElapsed;
	}
	public static void main(String[] args)
	{

		System.out.println(elapsedTime(1221,2321));
	}

}
