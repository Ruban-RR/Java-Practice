package codes;

public class ArrayPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
		for (int i = 0; i < cars.length; i++) {
		  System.out.println(cars[i]);
		}
		for(String car:cars) {
			System.out.println(car);
		}
	}

}
