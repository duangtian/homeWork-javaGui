package hw_5_2;

//5809610198
import java.util.ArrayList;

public class ArrayUtil  {

	public static <E> void print(ArrayList<E> list){
		
		for(E item : list){
			System.out.println(item.toString());
		}
		
	}
	
	public static<E> ArrayList<E> concat(E[] list1,E[] list2){
		ArrayList<E> concatList = new ArrayList<E>();
		for(E itemList : list1){
			concatList.add(itemList);
		}
		for(E itemList : list2){
			concatList.add(itemList);
		}

		return concatList;
	}
	public static <E extends Comparable> E findMax(E[] list){
		E maxItem = list[0];
		for(E item : list){
			if(item.compareTo(maxItem) == 1){
				maxItem = item;
			}
		}
		return maxItem; 
		
	}
	
	
}
