import java.util.Scanner;
public class nameThingMain
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		NameThing n1 = new NameThing();
		System.out.println("Please insert your Sub Name");
		String name = in.nextLine();
		n1.setSubName(name);
		n1.subName();
		System.out.println("The name without vowels is: "+ n1.getName());
	}

}
