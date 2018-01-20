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
	public void grow(){
		this.stem.setHeight(25);
		this.stem.setWidth(3);
		this.bud.setSize(8);
	}
	public void bloom(){
		this.bud.setSize(12);
		this.bud.setColor("yellow");
		this.bud.addFreshLeaves();
	}
	public void wither(){
		this.bud.setSize(6);
		this.bud.setColor("brown");
		this.bud.witherLeaves();
	}
	public void fortune(int choice, String s1, String s2){
		if(this.yourchoice()){
			if( choice == 1)
				System.out.println(s2);
			else System.out.println(s1);
		}
		else if(choice ==1)
			System.out.println(s1);
		else System.out.println(s2);
	}
	public boolean yourchoice(){
		int numberOfLeaves = this.bud.getNumberOfLeaves();
		if (numberOfLeaves%2 == 0)
			return true;
		else return false;
			
	}

}
