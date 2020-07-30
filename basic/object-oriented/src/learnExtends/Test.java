package learnExtends;

public class Test {
	public static void main(String[] args) {
		ThreeCar threecar = new ThreeCar();
		threecar.name="A";
		threecar.price="500";
		threecar.species="1";
		threecar.kind="11";
		threecar.showInfo();
		threecar.printKind();
		System.out.println("\n");
		FourCar fourcar = new FourCar();
		fourcar.name="B";
		fourcar.price="200";
		fourcar.species="2";
		fourcar.showInfo();
	}
}
