package inclass;
import java.util.Scanner;


class Point{
	private int x1;
	private int y1;
	private int x2;
	private int y2;
	private int points;
	public Point() {
		
		
	}
	public void setX1() {
		this.x1=x1;
		
	}
	public void setY1() {
		this.y1=y1;
		
	}
	public void setX2() {
		this.x2=x2;
		
	}
	public void setY2() {
		this.y2=y2;
		
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter x1 :");
		x1 =sc.nextInt();
		System.out.println("Enter y1:");
		y1=sc.nextInt();
		System.out.println("Enter x2 :");
		x2 =sc.nextInt();
		System.out.println("Enter y2:");
		y2=sc.nextInt();
		sc.nextLine();
		sc.close();
	}
	public  double distance() {
		
		
		return  Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
		
	}
}
public class bai3 {
	public static void main(String[] args) {
		Point p = new Point();
		p.input();
		System.out.println("The distance is:"+p.distance());
		
	}

}

	
