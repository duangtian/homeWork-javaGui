package hw_4_2;
//5809610198

public class Dessert{

	protected String name;
	protected String StoreName;
	protected String Category;
	protected float Calorie;

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

	
	public String getShop() {

		return StoreName;
	}


	public String toString() {
		return String.format("[Dessert]: %s, category:%s, storeName:%s, calorie:%.2f\n", name, Category, StoreName,
				Calorie);

	}
}
