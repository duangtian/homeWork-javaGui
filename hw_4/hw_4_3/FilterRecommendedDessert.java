package hw_4_3;

public class FilterRecommendedDessert implements FilterInterface{

	@Override
	public boolean isSatisfied(Dessert d) {
		
		RecommendedDessert ds;
		if(d instanceof RecommendedDessert){
			ds = (RecommendedDessert)d;
			if(ds.getStar()>2){
			return true;
			}
			return false;
		}else{
			return false;
		}
	}
}
