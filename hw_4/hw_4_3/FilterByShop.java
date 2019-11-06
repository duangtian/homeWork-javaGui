package hw_4_3;

public class FilterByShop implements FilterInterface {
	private String shop;

	public FilterByShop(String shop) {
		this.shop = shop;
	}

	@Override
	public boolean isSatisfied(Dessert d) {
		if (shop.equalsIgnoreCase(d.getShop())) {
			return true;
		} else
			return false;
	}

}
