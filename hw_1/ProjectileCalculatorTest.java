package hw_1;

//5809610198
import java.util.Scanner;

public class ProjectileCalculatorTest {
	private static Scanner in;

	public static void main(String[] args){
				
		ProjectileCalculator object = new  ProjectileCalculator ();
		in = new Scanner(System.in);
		 
		System.out.println("Please input velocity");
		object.setterVelocity(in.nextDouble());
		 
		System.out.println("Please input angle");
		object.setterAngle(in.nextDouble());
		
		System.out.printf("The highest point is at %.2f meter and the distance before falling is %.2f",object.higestPoint(),object.distance());
	}

}
