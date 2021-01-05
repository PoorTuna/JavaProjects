import java.util.Arrays;

public class ArrayInArray
{
	private int[][] a;
	
	public ArrayInArray(int sizeX,int sizeY)
	{
		this.a = new int[sizeX][sizeY];
		for ( int y = 0 ; y < a.length ; y++)
		{
		
			for ( int x = 0 ; x < a.length ; x++)
			{
			this.a[y][x] = x;
			}
		}
		
	}
	
	public int[][] getA()
	{
		return this.a;
	}
	
	
	
	
	public static void main(String[] args)
	{
		ArrayInArray a1 = new ArrayInArray(5,5);
		for (int i = 0 ; i < 5 ; i ++)
		{
			System.out.println(Arrays.toString(a1.getA()[i]));
		}
	}

	
	
	
	
}
