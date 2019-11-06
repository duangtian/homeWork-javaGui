//5809610198
import java.util.Scanner;

public class CanTest{
	public static void main(String[] args){
		
		Scanner scan =	new Scanner(System.in);
		Can CanCan = new Can();
		float r;
		float h;

		System.out.println("Please input the radius of a can");
		r = scan.nextFloat();
		
		
		System.out.println("Please input the height of a can ");
		h = scan.nextFloat();
		
		CanCan.setRadian(r);
		CanCan.setHeight(h);

		System.out.printf("The side area of this can is: %f\n" ,CanCan.calculateSideArea());
		System.out.printf("The volume of this can is: %f" ,CanCan.calculateVolume());
	}
   
}
