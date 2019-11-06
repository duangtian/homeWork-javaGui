package hw_5_1;

//5809610198
import java.util.Scanner;

public class Dessert implements Comparable<Dessert> {

	protected String name;
	protected String StoreName;
	protected String Category;
	protected float Calorie;

	public Dessert(String data) throws DessertException {

		String[] word = data.split(",");
		if (word.length != 4) {
			throw new DessertException("Missing Information:" + data);
		}
		try {
			this.name = word[0];
			this.StoreName = word[1];
			this.Category = word[2];
			this.Calorie = Float.valueOf(word[3]);
		} catch (NumberFormatException e) {
			throw new DessertException("Invalid Info:" + data);

		}

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

	@Override
	public String toString() {
		return String.format("[Dessert]: %s, category:%s, storeName:%s, calorie:%.2f", name, Category, StoreName,
				Calorie);

	}

	public void print() {
		System.out.println(toString());
	}

	@Override
	public int compareTo(Dessert Other) {
		if (getCalorie() == Other.getCalorie()) {
			return 0;
		} else if (getCalorie() > Other.getCalorie()) {
			return 1;
		} else {
			return -1;
		}
	}
}
