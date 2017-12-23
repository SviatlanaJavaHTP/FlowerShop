package by.htp.flower.bean;

public class Bud {
	
	private Leaf leaves[];
	private String color;
	private int size;
	
	public Bud(int size){	
		this.size = size;
		this.color = "green";
	}

	public String getColor() {
		return color;
	}

	public int getSize() {
		return size;
	}

	
}
