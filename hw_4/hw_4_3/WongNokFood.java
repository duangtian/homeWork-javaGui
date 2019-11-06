package hw_4_3;

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
	public ArrayList<Dessert> getFilterFood(FilterInterface filter){
		
		ArrayList<Dessert> dc = new ArrayList<Dessert>();
		for(Dessert ds : list){
			if(filter.isSatisfied(ds)){
				dc.add(ds);
			}
		}
		return dc;
	}
	public static void print(ArrayList<Dessert> tmp) {
		for(Dessert dx: tmp){
			System.out.print(dx.toString());
		}
	}
}
