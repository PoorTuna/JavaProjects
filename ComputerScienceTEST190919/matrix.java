
public class matrix
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[][] a =  new int[10][10];
		int sumtopright = 0, sumbottomleft = 0;
		
		
		// The program intention is to summarize the values of cells besides main diagonal.
		for (int y = 0; y < a.length ; y ++)
		{
			for (int x = 0; x < a[0].length ; x ++)
			{
				//Main Diagonal Top right Check:
				if ( x > y)
					sumtopright += a[y][x];
				
				//Main Diagonal Bottom left Check:
				if( x < y )
					sumbottomleft += a[y][x];
				
			}
		
		
		}
		
	}

}
