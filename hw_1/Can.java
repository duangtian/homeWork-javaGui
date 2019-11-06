//5809610198
public class Can {
	private float radian;
	private float height;


	
	public void setRadian(float r){
		radian = r;
	}
	
	public void setHeight(float h){
		height	=	h  ;		
	}
	
	public float calculateSideArea(){
		return (float) (2*Math.PI*radian*height);
	}

	public float calculateVolume(){
		return (float) ( height*Math.PI*radian*radian);
	}
	
}