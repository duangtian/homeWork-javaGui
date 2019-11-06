package hw_3;
//5809610198
public class GridData {
	private boolean isOpen;
	private boolean hasBomb;
	
	public GridData(){
		isOpen = false;
		hasBomb = false;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public boolean isHasBomb() {
		return hasBomb;
	}

	public void setHasBomb(boolean hasBomb) {
		this.hasBomb = hasBomb;
	}
}
