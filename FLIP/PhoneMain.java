
public class PhoneMain
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		Phone Galaxy = new Phone(100, 100, 200, 400);
		Phone Galaxy2 = new Phone(700, 100, 100, 200);
		Galaxy.draw();
		Galaxy2.draw();
		
		Galaxy.moveTo(200, 100);
		
		Galaxy.moveD(200, 50);
		
		//Galaxy.copyTo(100, 100);
		
		//Galaxy.Flip();
		
		System.out.println(Galaxy.Compare(Galaxy2));
		
		Galaxy.Scale(0.5);
		
	}

}
