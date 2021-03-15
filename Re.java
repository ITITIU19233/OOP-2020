package inclass;

import java.util.Scanner;

class Rectangle{
	private int width;
	private int length;
	
	public Rectangle( int width, int length) {
		this.width = width;
		this.length=length;
		
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter width of the rectangle:");
		int width=sc.nextInt();
		System.out.println("Enter length of the rectangle:");
		int length=sc.nextInt();
		System.out.println("Enter num:");
		int num=sc.nextInt();
		if (width*length<0) {
			System.out.println("Error, please Enter a negative number");
			
		}
		else {
			
			for (int i=0; i<num;i++){
		        if (i==0 || i == num-1) {
		            for (int j=0;j<num;j++){
		                System.out.print("*");
		            }
		            System.out.println();
		        }
		        else {
		            System.out.print("*");
		            for (int j=1;j<num-1;j++){
		                System.out.print(" ");
		            }
		            System.out.println("*");
		        }
		    }
	}
		sc.nextLine();
		sc.close();
	}
	public void display() {
		
	}
	
}
public class Re {
	public static void main(String[] args) {
		Rectangle r = new Rectangle(500,500);
		r.input();
		
	}
}
