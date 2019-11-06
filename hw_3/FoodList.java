package hw_3;
//5809610198
import java.util.ArrayList;
import java.util.Random;

public class FoodList {
	private ArrayList<Dessert> dessert;

	public FoodList() {
		dessert = new ArrayList<Dessert>();
	}

	public void addFood(Dessert food) {
		dessert.add(food);
	}

	public int size() {
		return dessert.size();
	}

	public FoodList getRandomFood(int amount) {
		Random rn = new Random();
		FoodList foods = new FoodList();
		int random = rn.nextInt(dessert.size()), randomOld = random;
		while (amount > 0) {
			random = rn.nextInt(dessert.size());
			if (random == randomOld) {
				continue;
			}
			foods.addFood(dessert.get(random));
			amount--;
		}
		return foods;
	}

	public void removeFoodOver(float calorie) {
		ArrayList<Integer> index = new ArrayList<Integer>();
		for (int i = dessert.size() - 1; i >= 0; i--) {
			if (dessert.get(i).getCalorie() > calorie) {
				index.add(i);
			}
		}
		for (int j : index) {
			dessert.remove(j);
		}
	}

	public FoodList getFoodSoldAt(String storeName) {
		FoodList foods = new FoodList();
		for (Dessert fList : dessert) {
			if (fList.getStoreName().equals(storeName))
				foods.dessert.add(fList);
		}
		return foods;
	}

	public void print() {
		for (Dessert dc : dessert) {
			dc.print();
		}
	}
}
