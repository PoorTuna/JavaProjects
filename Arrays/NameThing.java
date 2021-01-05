
public class NameThing
{
	private String subName;
	private String newName = "" ;
	
	public NameThing()
	{
		this.subName = "" ;
	}
	
	
	public void setSubName(String name)
	{
		this.subName = name;
	}
	
	public String getSubName()
	{
		return this.subName;
	}
	
	public void subName()
	{
		this.subName = this.subName.toLowerCase();
		for ( int i = 0 ; i < this.subName.length() ; i++)
		{
			if ((this.subName.charAt(i) != 'a') && (this.subName.charAt(i) != 'e') && (this.subName.charAt(i) != 'o') && (this.subName.charAt(i) != 'u') && (this.subName.charAt(i) != 'i'))
			{
				this.newName = this.newName + this.subName.charAt(i);
			}
		}
		
	}
	
	public String getName()
	{
		return this.newName;
	}
	
	
}
