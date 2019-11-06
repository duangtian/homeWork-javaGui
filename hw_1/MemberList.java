package hw_1;


public class MemberList {
	private String memberNameList = "";
	private String groupName;
	private int amount;
	
	public MemberList(String groupName){
		this.groupName = groupName;
	}
	public void addMember(Person p){
		memberNameList = memberNameList + p.getName() + " : " + p.getGender() + '\n';
		amount += 1;
	}
	public void printInfo(){
		System.out.printf("Group: %s\n\n%s\n%d",groupName,memberNameList,amount);
	}
	
	
}
