package hw_1;

//5809610198
public class Person {

		final String FEMALE = "female";
		final String MALE = "male";
		
		private String name;
		private String gender;
		private double weight;
		private double height;
		
		public Person(String name,String gender,double weight,double height){
			this.name = name;
			this.gender = gender;
			this.weight = weight;
			this.height = height;		
		}
		public String getName(){
			return name;
		}
		public String getDetail(){
			String Detail = String.format("%s: grnder=%s, weight=%.2f kg, %.2f ld. height=%.1f cm, %.2f inches",name,gender,weight,weight*2.2046,height,height*0.39370 );
			return Detail;
		}
		public String getGender(){
			return gender;
		}
		public double getWeight(){
			return weight;
		}	
		public double getWeightPound(){
			return weight*2.2046;
		}
		public double getHeight(){
			return height;
		}
		public double getHeightInces(){
			return height*2.2046;
		}

	}



