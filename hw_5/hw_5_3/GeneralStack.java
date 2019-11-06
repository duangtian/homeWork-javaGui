package hw_5_3;

import java.util.ArrayList;

public class GeneralStack<T> {

	private ArrayList<T> stack;

	public GeneralStack() {
		this.stack = new ArrayList<T>();
	}
	public void putIn(T data){
		stack.add(data);
	}
	public T takeOut(){
		if(stack.size() == 0){
			return null;
		}else{
			return stack.remove(stack.size()-1);
		}
	}
	
	public boolean isEmpty(){
		if(stack.size() == 0){
			return true;
		}else{
			return false;
		}
	}
	public int size(){
		return stack.size();
	}

}
