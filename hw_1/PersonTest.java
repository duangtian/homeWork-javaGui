package hw_1;

//5809610198
public class PersonTest {
	public static void main(String[] args){
		
		Person p1 = new Person("Jane","female",45.0,153.0);
		Person p2 = new Person("Jack","male",70.0,175.0);
		Person p3 = new Person("Kate","fmale",40.0,157.0);
		
		System.out.println(p1.getDetail());
		System.out.println(p2.getDetail());
		System.out.println(p3.getDetail());
	}
}
