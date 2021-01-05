import java.util.Arrays;
import java.util.Random;
public class ImportArrays
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Random rnd = new Random();
		int[] sort = new int[50];
		                  
		for (int i = 0 ; i <sort.length ; i++)
		{
			int number = rnd.nextInt(100)+1;
			sort[i] = number;
		}
		
		Arrays.sort(sort);
		
		System.out.println(Arrays.toString(sort));
		

		
		int[] copy  = Arrays.copyOf(sort, sort.length);
		System.out.println("----");
		System.out.println(Arrays.toString(copy));
		
		System.out.println(Arrays.equals(copy , sort));
		
	}

}
