package hw_4_2;

import java.util.ArrayList;

public class WongNokFood {
	private ArrayList<Dessert> list;

	public WongNokFood() {
		list = new ArrayList<Dessert>();
	}

	public void addFood(Dessert d) {
		list.add(d);
	}

	public void printList() {
	
		for (Dessert d : list) {
			System.out.print(d.toString());
			
		}

	}
}
