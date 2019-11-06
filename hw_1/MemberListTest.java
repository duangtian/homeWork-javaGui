package hw_1;

//5809610198
public class MemberListTest {
	public static void main(String[] args){
		MemberList member = new MemberList("Scuba Diving Fun ");
		Person p1 = new Person("Jane","female",45.0,153.0);
		Person p2 = new Person("Jack","male",70.0,175.0);
		Person p3 = new Person("Kate","fmale",40.0,157.0);
		
		member.addMember(p1);
		member.addMember(p2);
		member.addMember(p3);
		
		member.printInfo();
	}

}
