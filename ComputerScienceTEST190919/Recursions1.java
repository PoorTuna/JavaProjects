
public class Recursions1
{
	public static int countRec(int x, int y)
	{// This function is suppossed to sum 2 numbers together. works with negative numbers as well.
		if (y == 0 )
			return x;
		else{
			if (y > 0)
				return (countRec(x+1,y-1));
			else{
				return (countRec(x-1,y+1));
			}
		}
	}
	
	public static int countRec2(int x , int y)
	{// This function sums up to numbers together but in a different way. works with negative numbers as well.
		if (y == 0)
			return x;
		else{
			if (y > 0) 
				return (countRec2(x, y - 1) + 1);
			else
				return (countRec2(x, y + 1) - 1);
		}
	}

	public static int sumNumberRec(int i)
	{// This function counts the digits of a number.
		if (i == 0){
			return 0;
		}
		else{
			return (i % 10) + sumNumberRec( i / 10);
		}
	}
	
	public static int countDigitisRec(int i)
	{// This function counts the amount of digits in a number.
		if (i == 0)
		{
			return 0;
		}
		else{
			return countDigitisRec(i/10) + 1;
		}
	}
	
	public static int factorialRec(int i)
	{
		return factorialRec(i, 1);
	}
	private static int factorialRec(int i, int n)
	{
		if (i == 0)
			return n;
		else{
			return factorialRec(i-1,n * i);
		}
	}
	
	public static int factorialRec2(int i)
	{
		if (i == 0)
			return 1;
		
		return factorialRec2(i -1 ) * i;
	
	
	}

	// Two dimensional Recursion
	
	public static int fiboRec(int n)
	{
		return fiboRec(n,0);
	}
	
	private static int fiboRec(int n , int i)
	{
		if (n == 1)
			return 0;
		if (n == 2)
			return 1;
		else
		{
			return (fiboRec( n - 1 ) + fiboRec( n - 2 ));
		}
	}
	
	public static void s1(int n)
	{
		s2(n+1);
		System.out.print(n);
	}
	
	private static void s2(int n)
	{
		if (n == 10)
			System.out.print(n);
		
		else{
			System.out.print(n);
			s1(n+1);
			
		}
	}
	
	public static void main(String[] args)
	{

		System.out.println("[countRec]: The sum of these two numbers is " +countRec(10,-2));
		System.out.println("[countRec2]: The sum of these two numbers is " + countRec2(10,-2));
		System.out.println("[sumNumberRec]: The sum of this number's digits is " + sumNumberRec(245));
		System.out.println("[countDigitisRec]: The amount of number digits are " + countDigitisRec(245));
		System.out.println("[factorialRec]: The factorial of the number is " + factorialRec(5));
		System.out.println("[fiboRec]: The fibonachi number of that place is " + fiboRec(5));
		System.out.println("[s1]: The series is ");
		s1(5);
		System.out.println("[factorialRec2]: The factorial of the number is " + factorialRec2(5));
	}

}
