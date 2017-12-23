package by.htp.flower.bean;

public class Flower {
	
	private String title;
	private Bud bud;
	private Stem stem;
	
	public Flower(String title){
		this.title = title;
		bud = new Bud(2);
		stem = new Stem(10, 1);
	}
	
	public String getTitle(){
		return title;
	}
	
	public Bud getBud(){
		return bud;
	}
	
	public Stem getStem(){
		return stem;
	}

}
