import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ArrayTesting2
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		int[] array = new int[20];
		int[] array2 = new int[20];
		for ( int i = 0 ; i < 20 ; i++)
		{
			array[i] = 0;
			array2[i] = 0;
		}
		
		System.out.println(array.equals(array2));
		
		System.out.println(Arrays.toString(array));
		String name = "Oren:Fucking:Kessler";
		String[] names = name.split(":");
		for( int i = 0 ; i < names.length ; i++)
		{
			System.out.println(names[i]);
		}
			
		Scanner in = new Scanner(System.in);
		Random rnd = new Random();
		System.out.println(rnd.nextFloat());
		
	}

}
