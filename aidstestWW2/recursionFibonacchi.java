
public class recursionFibonacchi
{

	static int fibonazi(int n)
	{
		if (n == 1){
			return 1;
		}
		if (n == 2)
		{
			return 1;
		}
		else{
			return fibonazi(n-1) + fibonazi(n-2);
		}
	}
	
	
	
	
	public static void main(String[] args)
	{
		System.out.println(fibonazi(10));
	}

}
