
public class Phone
{

	private Rectangle Frame;
	private Rectangle SmallFrame;
	private Circle Camera;
	private Circle Button;
	private Rectangle Icon1;
	private Rectangle Icon2;
	private Rectangle Icon3;
	private Rectangle Icon4;
	private int x, y;
	private int rectWidth, rectHeight;
	private double Scale;
	
		public Phone()
		{
			this.x = 0;
			this.y = 0;
		}
		
		public Phone(int x, int y, int rectWidth, int rectHeight)
		{
			this.x = x;
			this.y = y;
			this.rectWidth = rectWidth;
			this.rectHeight = rectHeight;
		}
		
		public void draw()
		{
			this.Frame = new Rectangle(x, y, rectWidth, rectHeight, "Black");
			this.Camera = new Circle(x+rectWidth/2, y+rectHeight*4/100, rectWidth*30/1000, "White");
			this.SmallFrame = new Rectangle(x+rectWidth*25/1000, y+rectHeight*90/1000, rectWidth*95/100, rectHeight*80/100, "White");
			this.Button = new Circle(x+rectWidth/2, y+rectHeight*94/100, rectWidth*70/1000, "White");
			this.Icon1 = new Rectangle(x+rectWidth*5/100, y+rectHeight*75/100, rectWidth*20/100, rectWidth*20/100, "Green");
			this.Icon2 = new Rectangle(x+rectWidth*28/100, y+rectHeight*75/100, rectWidth*20/100, rectWidth*20/100, "Yellow");
			this.Icon3 = new Rectangle(x+rectWidth*51/100, y+rectHeight*75/100, rectWidth*20/100, rectWidth*20/100, "Red");
			this.Icon4 = new Rectangle(x+rectWidth*74/100, y+rectHeight*75/100, rectWidth*20/100, rectWidth*20/100, "Magenta");
		}
		
		public void erase()
		{
			this.Frame.erase();
			this.Camera.erase();
			this.SmallFrame.erase();
			this.Button.erase();
			this.Icon1.erase();
			this.Icon2.erase();
			this.Icon3.erase();
			this.Icon4.erase();
		}
		
		public void moveTo(int newX, int newY)
		{
			this.x = newX;
			this.y = newY;
			this.erase();
			this.draw();
		}
		
		public void moveD(int dx, int dy)
		{
			this.x += dx;
			this.y += dy;
			this.erase();
			this.draw();
		}
		
		public void copyTo(int newX, int newY)
		{
			this.x = newX;
			this.y = newY;
			this.draw();
		}
		
		public void Flip()
		{
			this.Frame = new Rectangle(x, y, rectWidth, rectHeight, "Black");
			this.Camera = new Circle(x+rectWidth/2, y+rectHeight*96/100, rectWidth*30/1000, "White");
			this.SmallFrame = new Rectangle(x+rectWidth*25/1000, y+rectHeight*110/1000, rectWidth*95/100, rectHeight*80/100, "White");
			this.Button = new Circle(x+rectWidth/2, y+rectHeight*6/100, rectWidth*70/1000, "White");
			this.Icon1 = new Rectangle(x+rectWidth*5/100, y+rectHeight*15/100, rectWidth*20/100, rectWidth*20/100, "Magenta");
			this.Icon2 = new Rectangle(x+rectWidth*28/100, y+rectHeight*15/100, rectWidth*20/100, rectWidth*20/100, "Red");
			this.Icon3 = new Rectangle(x+rectWidth*51/100, y+rectHeight*15/100, rectWidth*20/100, rectWidth*20/100, "Yellow");
			this.Icon4 = new Rectangle(x+rectWidth*74/100, y+rectHeight*15/100, rectWidth*20/100, rectWidth*20/100, "Green");
		}
		
		public boolean Compare(Phone Galaxy)
		{
			if(this.rectWidth == Galaxy.rectWidth && this.rectHeight == Galaxy.rectHeight)
				return true;
			else
				return false;
		}
		
		public void Scale(double scaleNum)
		{
			this.Scale = scaleNum;
			this.rectWidth = (int)((rectWidth)*Scale);
			this.rectHeight = (int)((rectHeight)*Scale);
			this.erase();
			this.draw();
		}
	
}
