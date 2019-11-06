package hw_5_1;

import java.util.Scanner;

//5809610198

public class Dessert {

	protected String name;
	protected String StoreName;
	protected String Category;
	protected float Calorie;

	public Dessert(String data) throws DessertException {

		String[] word = data.split(",");
		if (word.length != 4) {
			System.out.println(data);
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
		return String.format("[Dessert]: %s, category:%s, storeName:%s, calorie:%.2f\n", name, Category, StoreName,
				Calorie);

	}

	public void print() {
		System.out.print(toString());
	}
}
