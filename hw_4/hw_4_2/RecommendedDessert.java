package hw_4_2;

public class RecommendedDessert extends Dessert {

	private int star;

	public RecommendedDessert(String NameOfDesert, String category, String storeName, float Calorie, int star) {
		super(NameOfDesert, category, storeName, Calorie);
		this.star = star;
	}

	public int getStar() {
		return star;
	}

	public void setStar(int star) {
		this.star = star;
	}

	public String toString() {
		
		return String.format("[Recommende]: %s category:%s, storeName:%s, calorie:%.2f\n", name, Category, StoreName,
				Calorie);
	}

}
