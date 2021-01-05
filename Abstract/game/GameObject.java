package game;

public abstract class GameObject
{
	// You dont implement abstract methods! 
	// you merley just define their existence and provide classes that extend this class the neccisity to implement this by themselves
	// Note: CLASSES MUST IMPLEMENT ABSTRACT CLASSES WITHIN THEMSELVES
	
	
	public abstract void draw();
	
	public static void main(String[] args)
	{
		Player player = new Player();
		menu menu = new menu();
		//GameObject new_game = new GameObject(); -> is not valid!
		//abstract classses exist to be extended and cannot be instantiated
		GameObject[] g1 = new GameObject[2];
		g1[0] = player; // GameObject g1 = new player();
		g1[1] = menu; // GameObject g1 = new menu();
		for( GameObject g : g1){
			g.draw();
		}
		int[] a1 = new int[2];
		
	
	}

}
