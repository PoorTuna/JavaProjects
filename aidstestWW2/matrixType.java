
public class matrixType
{
	private int n;
	private int m;
	private int[][] matrix;
	
	public matrixType(int n, int m)
	{
		this.n = n;
		this.m = m;
		matrix = new int[n][m];
	}
	
	public void inputMatrix(matrixType m1)
	{
		this.n = m1.n;
		this.m = m1.m;
		this.matrix = m1.matrix;
	}
	
	public boolean isEquals(matrixType m1)
	{
		if ( ( this.n == m1.n ) && ( this.m == m1.m) )
		{
			for ( int x = 0 ; x < this.n ; x++)
			{
				
				for (int y = 0 ; y < this.m ; y++)
				{
					if (this.matrix[x][y] != m1.matrix[x][y])
					{
						return false;
					}
				}
			}
			return true;
		}
		return false;
	}
	
	public String toString()
	{
		String s1 = "";
		for ( int x = 0 ; x < this.n ; x++)
		{
			
			for (int y = 0 ; y < this.m ; y++)
			{
				s1 += this.matrix[x][y];
			}
		}
		return s1;
	}
	public void printMatrix()
	{
		for ( int y = 0 ; y < this.m ; y++)
		{
			
			for (int x = 0 ; x < this.n ; x++)
			{
				System.out.println(this.matrix[x][y]);
			}
		}
	}
	
	public void insertMatrix(Position p,int x){
		int[][] temp;
		if( (p.getI() > this.n) && (p.getJ() > this.m))
		{
			this.n = p.getI();
			this.m = p.getJ();
			int[][] tempMatrix = new int[n][m];
			
			for ( int y = 0 ; y < this.m ; y++)
			{
				for (int z = 0 ; z < this.n ; z++)
				{
					tempMatrix[z][y] = this.matrix[z][y];
				}
			}
			tempMatrix[n][m] = x;
			this.matrix = tempMatrix;
			
		}
		else if( (p.getI() > this.n) || (p.getJ() > this.m)){
			if (p.getI() > this.n)
			{
				this.n = p.getI();
				int[][] tempMatrix = new int[n][m];
				
				for ( int y = 0 ; y < this.m ; y++)
				{
					for (int z = 0 ; z < this.n ; z++)
					{
						tempMatrix[z][y] = this.matrix[z][y];
					}
				}
				tempMatrix[n][m] = x;
				this.matrix = tempMatrix;
				
			}
			if (p.getJ() > this.m)
			{
				this.m = p.getJ();
				int[][] tempMatrix = new int[n][m];
				
				for ( int y = 0 ; y < this.m ; y++)
				{
					for (int z = 0 ; z < this.n ; z++)
					{
						tempMatrix[z][y] = this.matrix[z][y];
					}
				}
				tempMatrix[n][m] = x;
				this.matrix = tempMatrix;
				
			}
		}
		else{
			this.matrix[p.getI()][p.getJ()] = x;
		}
	}
	
	
}
