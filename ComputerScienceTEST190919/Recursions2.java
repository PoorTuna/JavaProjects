
public class Recursions2
{
	public static void s3(){
		System.out.println("xd");}
	
	public static void s1(int n)
	{
		
		s2(n+1);
		System.out.println(n);
	}

	private static void s2(int n)
	{
		if (n == 10)
			System.out.println(n);
		else{
		System.out.println(n);
		s1(n+1);
		}
	}
	
	public static void main(String[] args)
	{
		s1(1);
	}

}
