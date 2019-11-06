package hw_3;
//5809610198
import java.util.ArrayList;

public class ScoreCalculator {
	private int[] scoreCounter;
	private ArrayList<StudentScore> std;
	
	public ScoreCalculator(int maxScore){
		std = new ArrayList<StudentScore>();
		scoreCounter = new int[maxScore+1];
	}
	
	public void addScore(StudentScore sc){
		std.add(sc);
		
	}
	
	public void printList(){
		System.out.println("-------- List of Student Scores ----------");
		for(StudentScore sc: std){
			System.out.println(sc.getId()+ " : " +sc.getScore());
		}
	}
	public void printStat(){
		System.out.println("Score Report for " +std.size()+ " students");
		double sum = 0;
		int maxScore = 0,minScore =  99999999;
		String max = "", min = "";
		
		for(StudentScore sc : std){
			scoreCounter[sc.getScore()] += 1;
			sum += sc.getScore();
			if(sc.getScore()<minScore){
				minScore = sc.getScore();
				min = sc.getId();
			}
			if(sc.getScore()>maxScore){
				maxScore = sc.getScore();
				max = sc.getId();
			}
		}
		System.out.println("Min score is " + min +  " : " + minScore + " points");
		System.out.println("Min score is " + max +  " : " + maxScore + " points");
		System.out.printf("Average score is %.2f points\n",sum/std.size());
		System.out.println("Score Distribution");
		for(int i = 0; i <= maxScore ; i++){
			System.out.print(i + ":");
			for(int j = scoreCounter[i]; j > 0; j--){
				System.out.print("*");
			}
			System.out.print("\n");
		}
		
	}
	
	}
