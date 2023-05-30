package hust.soict.dsai.aims.cart;

import hust.soict.dsai.aims.disc.DigitalVideoDisc;

public class Cart {
	public static final int MAX_NUMBERS_ORDER =20;
	private	DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDER] ;
	private int qtyOrdered = 0;

	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if (qtyOrdered<MAX_NUMBERS_ORDER) {
			itemsOrdered[qtyOrdered] = disc;
			qtyOrdered+=1;
			System.out.println("The disc has been added");
		}else {
			System.out.println("The cart is almost full");
		}
	}
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		for (int i=0;i<qtyOrdered;i++){
			if (itemsOrdered[i].equals(disc)){
				for (int j=i;j<qtyOrdered-1;j++) {
					itemsOrdered[j]=itemsOrdered[j+1];
				}
			}
		}
		qtyOrdered-=1;
		System.out.println("The disc has been removed");
	}
	public float totalCost() {
		float cost=0;
		for (int i=0;i<qtyOrdered;i++) {
			cost+=itemsOrdered[i].getCost();
		}
		return cost;
	}
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items: ");
		for (int i=0;i<qtyOrdered;i++) {
			System.out.println(itemsOrdered[i].toString());
		}
		System.out.println("Total cost: " + this.totalCost());
		System.out.println("***************************************************");
	}
	public void search(int id) {
		int count=0;
		for (int i=0;i<qtyOrdered;i++) {
			if (itemsOrdered[i].isMatch(id)){
				System.out.println(itemsOrdered[i].toString());
				count+=1;
			}
		}
		if (count==0) {
			System.out.println("No match is found");
		}
	}
	public void search(String title) {
		int count=0;
		for (int i=0;i<qtyOrdered;i++) {
			if (itemsOrdered[i].isMatch(title)){
				System.out.println(itemsOrdered[i].toString());
				count+=1;
			}
		}
		if (count==0) {
			System.out.println("No match is found");
		}
	}
}