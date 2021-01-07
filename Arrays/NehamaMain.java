import java.util.Scanner;
public class NehamaMain
{


	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		NehamaZona n1 = new NehamaZona();

		
		for ( int i = 0 ; i < 20 ; i++)
		{
			System.out.println("Please enter the " + (i+1) +" Student name.");
			String name = in.next();
			n1.setName(name);
			
			System.out.println("Please insert the first grade [Hebrew]");
			double grade = in.nextDouble();
			n1.setHebrew(grade);
			
			System.out.println("Please insert the first grade [Math]");
			double grade2 = in.nextDouble();
			n1.setMath(grade2);
			
			n1.doResult();
			
		}
		System.out.println(n1.getResult());
		
	}

}
