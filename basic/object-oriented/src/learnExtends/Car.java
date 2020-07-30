package learnExtends;

public class Car {
	String name;
	String price;
	String species;
	
	public void setInfo(String name,String price,String species) {
		this.name=name;
		this.price=price;
		this.species=species;
	}
	
	public void showInfo() {
		System.out.println(this.name);
		System.out.println(this.price);
		System.out.println(this.species);
	}
}
