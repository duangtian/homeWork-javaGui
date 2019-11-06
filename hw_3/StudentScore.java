package hw_3;
//5809610198
public class StudentScore {
	private String id;
	private int score;
	
	public StudentScore(String id,int score){
		this.id = id;
		this.score = score;
	}
	
	public String getId(){
		return id;
	}
	
	public int getScore(){
		return score;
	}
}
