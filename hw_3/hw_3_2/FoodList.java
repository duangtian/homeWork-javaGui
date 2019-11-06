package hw_3_2;
//5809610198
import java.util.ArrayList;
import java.util.Random;
import hw_3.Dessert;

public class FoodList {
	private ArrayList<Edible> dessert;

	public FoodList() {
		dessert = new ArrayList<Edible>();
	}

	public void addFood(Edible food) {
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
		
		for (int i = dessert.size()-1; i >= 0; i--) {

			if (dessert.get(i).getCalorie() > calorie) {
				index.add(i);
			}
		}
		for (int j : index) {
			//System.out.println(j);
			dessert.remove(j);
		}

	}

	public FoodList getFoodSoldAt(String storeName) {
		FoodList foods = new FoodList();
		for (Edible fList : dessert) {
			if (fList.getShop().equals(storeName))
				foods.addFood(fList);

		}

		return foods;
	}

	public void print() {
		for (Edible dc : dessert) {
			dc.printInfo();
		}
	}

	public FoodList getVegetarianFood() {
		FoodList vegetalian = new FoodList();
		for (Edible fList : dessert) {
			Meal meal = new Meal(null, null, 0, false);
			if (fList instanceof Meal) {
				meal = (Meal) fList;
			}

			if (meal.isVegetarian()) {
				Edible vMeal = (Edible) meal;
				vegetalian.addFood(fList);
			}

		}

		return vegetalian;
	}
}
