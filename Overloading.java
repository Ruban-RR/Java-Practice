package codes;

public class Overloading {
	public void add(int a, int b) {
		System.out.println(a+b);	
	}
	public void add(int a, int b, int c) {
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading over = new Overloading();
		over.add(10, 20);
		over.add(5, 2, 8);
		
	}
	public static void main(int[] args)  //overloading main method but it does not work. 
	{
		System.out.println("int main");
		Overloading ov = new Overloading();
		ov.add(20, 20);
		ov.add(20, 40, 50);
	}

}
