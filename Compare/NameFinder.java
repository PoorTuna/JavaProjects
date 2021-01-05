import java.util.*;
public class NameFinder
{
	private String name;
	
public NameFinder(String contestant)
{
	this.name = contestant;
}



public boolean isAccepted() 
{
	boolean accepted = false;
	Scanner in = new Scanner(System.in);
	
	
	System.out.print("Enter first winner name: ");
	String str = in.next();
	
	while (this.name.compareTo(str) < 0)
	{
		
		System.out.print("Enter next winner name: ");
		str = in.next();
	} // while
	if (this.name.equals(str))
	{
		accepted = true;
	}
	if (this.name.compareTo(str) > 0)
	{
		accepted = true;
	}
	
	return accepted;
}

public String getName() {
	return this.name;
}

public void setName(String name) {
	this.name = name;
}







}
