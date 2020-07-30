package learnExtends;

public class ThreeCar extends Car{
	public ThreeCar() {
		super();
	}
	
	String kind;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}
	
	public void printKind() {
		System.out.println(this.kind);
	}
}
