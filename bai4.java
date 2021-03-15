package inclass;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;


class Order {

	private String oderID;
	private List<Item> listItem;
	
	
	
	public Order(String oderID, List<Item> listItem) {
		super();
		this.oderID = oderID;
		this.listItem = listItem;
	}
		
	public String getOderID() {
		return oderID;
	}

	public void setOderID(String oderID) {
		this.oderID = oderID;
	}

	public List<Item> getListItem() {
		return listItem;
	}

	public void setListItem(List<Item> listItem) {
		this.listItem = listItem;
	}

	
	public void addItem(Item i) {
		listItem.add(i);
	}
	public double calculateaverage() {
		double total =0;
		for(Item i:listItem) {
			total +=i.getPrice()/3;
		}
		return total; 
	}

	
}
class Item {
	private int id;
	private String name;
	private int price;
	
	public Item(int id, String name, int price) {
		this.id=id;
		this.name=name;
		this.price=price;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
		
	}
	public void setName(String name) {
		this.name= name;
		
	}
	public int getPrice() {
		return price;
		
	}
	public void setPrice(int price) {
		this.price=price;
		
	}
	
}
public class bai4 {
	public static void main(String []args) {
		Item a = new Item (3,  "cocacola", 8000);
		Item b=new Item(4,"Noodles", 10000);
		Item c=new Item(5,"paper", 15000);
		List<Item> e = new ArrayList<Item>();
		e.add(a);
		e.add(b);
		e.add(c);
		Order y = new Order ("002",e);
		System.out.println(y.calculateaverage());
		
	}


}
