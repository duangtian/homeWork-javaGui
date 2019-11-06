package hw_5_2;
//5809610198

public class Dessert implements Comparable{

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


	public int compareTo(Dessert other) {
		if(getCalorie() == other.getCalorie()){
			return 0;
		}else if(getCalorie() > other.getCalorie()){
			return 1;
		}else{
			return -1;
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}

}
