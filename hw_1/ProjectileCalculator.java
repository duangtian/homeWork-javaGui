package hw_1;

//5809610198
public class ProjectileCalculator {
	private double v;
	private double seta;
	
	public void setterVelocity(double velocity){
		v = velocity;
	}
	public void setterAngle(double angle){
		seta = angle;
	}
	public double higestPoint(){
		return Math.pow(v, 2)*Math.pow(Math.sin(Math.toRadians(seta)),2)/(2*10);
	}
	public double distance(){
		return Math.pow(v, 2)*Math.sin(2*Math.toRadians(seta))/10;
	}
}
