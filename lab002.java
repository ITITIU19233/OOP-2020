package inclass;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Random;

class Particles {
	
	private int x;
	private int y;
	private int d;
	
	public int getx() {
		return x;
	}
	public void setx(int x) {
		this.x = x;
	}
	public int gety() {
		return y;
	}
	public void sety(int y) {
		this.y = y;
	}
	
	Random Rand = new Random();
	
	public Particles(int width, int height) {
		this.x = Rand.nextInt((width  -2) +1) +1; 
		this.y = Rand.nextInt((height -2) +1) +1;
	}
	
	
	enum Directions
	{
  
		North(1), NorthEast(2), East(3), SouthEast(4), South(5), SouthWest(6), West(7), NorthWest(8);
 
		private int value;
		 
        Directions(int value) {
            this.value = value;
        } 
   
        public static Directions getDirectionsByValue(int value)
        {
            for (Directions d : Directions.values())
            {
                if (d.value == value) {
                    return d;
                }
            }
            return null;
        }
    }
	
	public void Directions(int height,int width)
	{
		d = Rand.nextInt((8 - 1) + 1) + 1;
		Directions value = Directions.getDirectionsByValue(d);
		switch (value)
		{
		  case North:
			if(this.y > 1)
			{
				this.y = y-1;
			}
		 
		    break;
		  case NorthEast:
			if(this.y > 1 && this.x < width-1)
			{
				this.y = y-1;
				this.x = x+1;
			}
		    break;
		  case East:
			if(x < width-1)
			{
			  x = x + 1;
			}
		    break;
		  case SouthEast:
			 if(y < height-1 && x < width-1)
			 {
				 y = y + 1;
			 	 x = x + 1;
			 }
		    break;
		  case South:
			  if(y < height-1)
			  {
				  y = y+1;
			  }
		    break;
		  case SouthWest:
			if(y < height-1 && x > 1)
			{
				y = y + 1;
				x = x - 1;
			}
		    break;
		  case West:
			if(x > 1)
			{
				x = x - 1;
			}
		    break;
		  case NorthWest:
			if(y > 1 && x > 1)
			{
				y = y - 1;
				x = x - 1;
			}
		}
	}
	
	
	
}

class Box {

	private int height;
	private int width;
	

    private static Box _instance = new Box();
    

    public static Box Instance()
    {
        return _instance;
    }
    

    private Box()
    {
    	
    }
   
    public Box(int height, int width)
    {
    	this.height = height;
		this.width = width;
    }
    
	public int getheight()
	{
		return this.height;
	}
	
	public void setheight(int height)
	{
		height= this.height;
	}
	
	public int getwidth()
	{
		 return this.width;
	}
	
	public void setwidth(int width)
	{
		width= this.width;
	}
	
	
	
	

	public void DrawBox( int height, int width, int x, int y, int x2, int y2, int x3, int y3)
	{
		for (int i=0;i< width;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		for (int i=0;i<height;i++)
		{
			System.out.print("|");
			for (int j=1;j< width-1;j++)
			{
				if (i==y && j==x) System.out.print("*");
				else if (i==y2 && j==x2) System.out.print("*");
				else if (i==y3 && j==x3) System.out.print("*");
					else System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
		for (int i=0;i< width;i++)
		{
			System.out.print("-");
		}
	}
	
	
	public void ShowNewParticle( int height, int width, int x, int y)
	{
		for (int i=0;i< width;i++)
		{
			System.out.print("-");
		}
		System.out.println();
		for (int i=0;i<height;i++)
		{
			System.out.print("|");
			for (int j=1;j< width-1;j++)
			{
				if (i==y && j==x) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.print("|");
			System.out.println();
		}
		for (int i=0;i< width;i++)
		{
			System.out.print("-");
		}
	}
	 
}


public class lab002{
	
		public static int height = 5;
		public static int width = 10;
		public static int num = 3; 
		public static int collied=0; 
		public static boolean check = false; 
		

		
		public static Particles[] Part = new Particles[100];
		
		public static void main(String[] args) throws InterruptedException {
			
			Box  box = Box.Instance();
			int nSteps =20 ;
			
			Part[1] = new Particles(width, height); 
			Part[2] = new Particles(width, height); 
			Part[3] = new Particles(width, height);
			
			
			for(int i=0; i < nSteps ;i++) 
			{
				
				for(int p = 1; p <= num; p++) 
				{
					int j=0;
					while(j<=7)
					{
						j++;
						Part[p].Directions(height,width);	
						
					}
					
						Thread.sleep(150);
						
					
						
				}
					
						//Part[p].Directions(height,width);	
				}
				

				if ( (Part[1].getx() == Part[2].getx()) && (Part[1].gety() == Part[2].gety()) ||
					 (Part[1].getx() == Part[3].getx()) && (Part[1].gety() == Part[3].gety()) ||
					 (Part[2].getx() == Part[3].getx()) && (Part[2].gety() == Part[3].gety()) ) 
				{
					collied = collied + 1;
					check = true;
					num = num + 1;
					Part[num] = new Particles(width,height);
				
				}
				
				box.DrawBox(height, width, Part[1].getx(), Part[1].gety(), Part[2].getx(), Part[2].gety(), Part[3].getx(), Part[3].gety());
				System.out.println();
				
				
				if(check == true )
				{
					System.out.println("A new particles is created after collied: ");
					box.ShowNewParticle(height, width, Part[num].getx(), Part[num].gety());
					check = false;
				}
				System.out.println();
				System.out.println("Collided " + collied+ " times in total");
				System.out.println("Total particles: " + num);
			}
			
		

	}

