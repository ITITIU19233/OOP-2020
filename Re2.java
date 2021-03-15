
package inclass;
import java.util.Scanner;


class Triangle{
	private int line1;
	private int line2;
	private int line3;
	private String check;
	
	
	public Triangle( int line1, int line2, int line3) {
		this.line1=line1;
		this.line2=line2;
		this.line3=line3;
		
	}
	public void input(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of first line:");
		 line1=sc.nextInt();
		System.out.println("Enter the length of second line:");
			line2=sc.nextInt();
		System.out.println("Enter the length of third line:");
			line3=sc.nextInt();
		
			
			sc.close();
			
	}
	public void test(String check) {
	
//	public String getCheck() {
//		return check;
//	}
//	public void setCheck( String check){
//	    this.check = check;
//	        
//	   }
	 if (line1+line2<line3||line1+line3<line2||line3+line2<line1)
        System.out.println("Not a triangle");
    else{
        if(line1*line1==line2*line2+line3*line3||line2*line2==line1*line1+line3*line3||line3*line3==line2*line2+line1*line1)
            System.out.println("Rectangular Triangle");
        else if(line1 == line2 && line2 == line3){
            System.out.println("Equalateral Triangle");}
        else if(line1==line2 || line1 ==line3 || line3 == line2){
            System.out.println("Isosceles Triangle");}
        else  {
            System.out.println("Normal Triangle.");
        }
    }
}
	
}
public class Re2 {
	public static void main(String []args) {
		Triangle tr = new Triangle(0,0,0);
		tr.input();
		tr.test(null);
		
	}

}
