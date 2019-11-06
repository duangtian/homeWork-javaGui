package hw_3_2;
//5809610198
public class Meal implements Edible {
	private String name;
	private String shop;
	private float calorie;
	private boolean vegetarian;

	public Meal(String name, String shop, float calorie, boolean vegetable) {
		this.name = name;
		this.shop = shop;
		this.calorie = calorie;
		this.vegetarian = vegetable;

	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getShop() {
		return shop;
	}

	@Override
	public float getCalorie() {
		return calorie;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	@Override
	public void printInfo() {
		System.out.printf("Meal [name:%s, shop:%s, calorie:%.2f", name, shop, calorie);
		System.out.println(", vegetarian = " + vegetarian + " ]");

	}

}
