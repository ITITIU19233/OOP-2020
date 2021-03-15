
package newbegin;

import java.util.Scanner;

interface Icar{
	float calculateTax();
	float calculatePrice();
	void getInfo();
	
}
class mainCar implements Icar{
	private String name;
	private String producer;
	private int seatNumber;
	private int year;
	private float rootprice;
	
	public mainCar() {
		this.name="";
		this.producer="";
		this.seatNumber=0;
		this.year=0;
		this.rootprice=0;
		
	}

	public mainCar(String name, String producer, int seatNumber, int year, float rootprice) {
		super();
		this.name = name;
		this.producer = producer;
		this.seatNumber = seatNumber;
		this.year = year;
		this.rootprice = rootprice;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public float getRootprice() {
		return rootprice;
	}

	public void setRootprice(float rootprice) {
		this.rootprice = rootprice;
	}
	public float calculateTax() {
		
		
		if (getSeatNumber()<7) {
			return (getRootprice() * 0.6f);
		}
		else {
			return  getRootprice() * 0.7f;
			
		}
		
	}
	public float calculatePrice() {
		float TotalPrice=0;
		TotalPrice = calculateTax() + getRootprice();
		return TotalPrice;
	}
	public void input() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter name for car: ");
		 name=sc.nextLine();
		System.out.println("Enter producer:");
		 producer =sc.nextLine();
		System.out.println("Enter release year: ");
		 year =sc.nextInt();
		 System.out.println("Enter number of seat:");
		 seatNumber =sc.nextInt();
		try {
			seatNumber = Integer.parseInt(sc.nextLine());
		}catch(NumberFormatException e){
			seatNumber =0;
			
		}finally {
			
		}
		System.out.println("Enter root price: ");
		try {
			rootprice = Float.parseFloat(sc.nextLine());
		}catch(NumberFormatException e){
			rootprice =0;
			
		}finally {
			
		}
		
	}
	public void getInfo() {
		System.out.println("Name of Car: "+ name);
		System.out.println("Name of Producer: "+ producer);
		System.out.println("Release year: "+ year);
		System.out.println("Number of seat: "+ seatNumber);
		System.out.println("Total price: "+ calculatePrice());
	}
	
	
}
class LuxuryCar extends mainCar{
	private float specialRate;
	public LuxuryCar(String name, String producer, int seatNumber, int year, int rootprice,float specialRate) {
		super(name,producer,seatNumber, year, rootprice);
		this.specialRate=specialRate;
		
	}
	public float getSpecialRate() {
		return specialRate;
	}
	public void setSpeacialRate(float specialRate) {
		this.specialRate = specialRate;
	}
	public void input() {
		Scanner sc = new Scanner (System.in);
		super.input();
		System.out.println("Enter special Rate: ");
		try {
			specialRate = Float.parseFloat(sc.nextLine());
		}catch(NumberFormatException e){
			specialRate =0;
			
		}finally {
			
		}
	}
	public float calculatePrice() {
		float TotalPrice=0;
		TotalPrice = calculateTax() + getRootprice()+ getRootprice() * getSpecialRate();
		return TotalPrice;
	}
	public float calculatePrice(float transportCost) {
		float TotalPrice=0;
		TotalPrice = calculateTax() + getRootprice()+transportCost;   //calculatePrice() +transportCost;
		return TotalPrice;
	}
	public void getInfo() {
		super.getInfo();
		
	}
	
}
public class Car {
	public static void main(String []args) {
		Scanner sc =new Scanner(System.in);
		LuxuryCar myluxurycar = new LuxuryCar(null, null, 0, 0, 0, 0);
		myluxurycar.input();
		myluxurycar.getInfo();
		float TotalPrice = myluxurycar.calculatePrice();
		System.out.println("Total price with transport cost : "+ TotalPrice);
		
	}
}
