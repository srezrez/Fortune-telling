package by.htp.flower.bean;

public class Bud {
	private Leaf leaves[];
	private String color;
	private int size;
	
	public Bud(int size){
		this.size = size;
		this.color = "green";
	}
	public String getColor(){
		return color;
	}
	public int getSize(){
		return size;
	}
	public void setSize(int size){
		this.size = size;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public void addFreshLeaves(){
		if(leaves!=null){
	}else {
		leaves = new Leaf[4];
		leaves[0] = new Leaf("White" , "ellipse");
		leaves[1] = new Leaf("White" , "ellipse");
		leaves[2] = new Leaf("White" , "ellipse");
		leaves[3] = new Leaf("White" , "ellipse");
	}

}
	public Leaf[] getLeaves() {
		return leaves;
	}
	public int getNumberOfLeaves(){
		return leaves.length;
	}
	public void setLeaves(Leaf[] leaves) {
		this.leaves = leaves;
	}
	public void witherLeaves(){
		leaves = null;
	}
}
