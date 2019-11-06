//5809610198
public class Desert {
	
	private String Desert;
	private String StoreName;
	private String Type;
	private double Calorie;
	
	public Desert(){
		Desert = "";
		StoreName = "";
		Type = "";
		Calorie = 0;		
	} 
	
	public void setDesert (String NameOfDesert ,String StoreName ,String TypeOfDesert ,double Calorie){
		
		Desert = NameOfDesert;
		this.StoreName = StoreName;
		Type = TypeOfDesert;
		this.Calorie = Calorie;
	}
	public void showDesert(){
		System.out.printf("name:%s, category:%s, storeName:%s, calorie:%.2f\n",Desert,StoreName,Type,Calorie);

	}

	
}
