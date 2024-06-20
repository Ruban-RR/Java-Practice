package codes;
class Aclass{
	public void example() {
		System.out.println("A");
	}
}
class Bclass extends Aclass{
	public void example() {
		super.example();
		System.out.println("B");
	}
}
class Overriding extends Bclass{
	public void example() {
		super.example();
		System.out.println("overrides");
	}
	public static void main(String[] args) {
		Overriding ov = new Overriding();
		ov.example();
		}
	}
