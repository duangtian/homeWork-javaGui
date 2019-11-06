package hw_3;
//5809610198
import hw_3_2.Edible;

public class Dessert implements Edible {

	private String name;
	private String StoreName;
	private String Category;
	private float Calorie;

	public Dessert() {
		name = "";
		StoreName = "";
		Category = "";
		Calorie = 0;
	}

	public Dessert(String NameOfDesert, String category, String storeName, float Calorie) {
		name = NameOfDesert;
		this.Category = category;
		this.StoreName = storeName;
		this.Calorie = Calorie;
	}

	public void print() {
		System.out.printf("Dessert [name:%s, category:%s, storeName:%s, calorie:%.2f]\n", name, Category, StoreName,
				Calorie);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStoreName() {
		return StoreName;
	}

	public void setStoreName(String storeName) {
		StoreName = storeName;
	}

	public String getCategory() {
		return Category;
	}

	public void setCategory(String category) {
		Category = category;
	}

	public float getCalorie() {
		return Calorie;
	}

	public void setCalorie(float calorie) {
		Calorie = calorie;

	}

	@Override
	public String getShop() {

		return StoreName;
	}

	@Override
	public void printInfo() {
		System.out.printf("Dessert [name:%s, category:%s, storeName:%s, calorie:%.2f]\n", name, Category, StoreName,
				Calorie);

	}
}
