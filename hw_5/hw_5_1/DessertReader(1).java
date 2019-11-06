package hw_5_1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DessertReader {

	private ArrayList<Dessert> foodlist;

	public DessertReader() {
		foodlist = new ArrayList<Dessert>();
		int cnt = 0;
		Scanner scan = null;
		try{
			
		 scan = new Scanner(new File ("dessert.txt"));
		 
		}catch(FileNotFoundException e){
			System.out.println("Error: Can't find data file");
		}
		if(scan != null){
		while (scan.hasNextLine()) {
			try {
				String line = scan.nextLine();
				foodlist.add(new Dessert(line));
			} catch (DessertException e) {
				cnt++;
				e.getMessage();
			}
		}
		if(cnt > 0)
		System.out.println("");
		}
		
	}

	public void print() {
		for (Dessert e : foodlist) {
			e.print();
		}
	}
}
