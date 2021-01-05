import java.util.Scanner;


public class objectArray
{
	private int birthday = 0;
	
	public objectArray()
	{
		this.birthday = 0;
	}
	public objectArray(int birthdayDate)
	{
		this.birthday = birthdayDate;
	}
	
	public objectArray(objectArray b1)
	{
		this.birthday = b1.birthday;
	}

	public void setBirthday(int birthdayDate)
	{
		this.birthday = birthdayDate;
	}
	
	public int getBirthdayDate()
	{
		return this.birthday;
	}
	
	
	public static void main(String[] args)
	{
		
		Scanner in = new Scanner(System.in);
		System.out.println("Please set birthday date amount:");
		int size = in.nextInt();
		
		objectArray[] b1 = new objectArray[size];
		
		for ( int i = 0 ; i < size; i ++)
		{
			System.out.println("Please set the birthday for guy number " + (i+1));
			int birthday = in.nextInt();
			
			b1[i] = new objectArray(); // b1[i] = new objectArray(birthday);
			b1[i].setBirthday(birthday);
			
			
		}
		
		System.out.println("Would you like to review the birthday dates? [y/n]");
		char confirmation = in.next().charAt(0);
		if (confirmation == 'y')
		{
			for (int i = 0 ; i < b1.length ; i ++)
			{
				System.out.println(b1[i].getBirthdayDate());
			}
		}
		
		
		
		
	}

}
