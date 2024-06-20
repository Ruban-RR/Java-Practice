package codes;

class add{
	void calculation(int x, int y) {
		int c=x+y;
		System.out.println("Addition: "+c);
	}
void calculation(float x, float y) {
	float c=x+y;
	System.out.println("Addition: "+c);
}}
class sub extends add{
	
	void calculation(int x, int y) {
		super.calculation(x, y);
		int c=x-y;
		System.out.println("Subtraction: "+c);
	}
	void calculation(float x, float y) {
		super.calculation(x, y);
		float c=x-y;
		System.out.println("Subtraction: "+c);
	}}
class mul extends sub{
	
	void calculation(int x, int y) {	
		super.calculation(x, y);
		int c=x*y;
		System.out.println("Multiplication: "+c);
	}
	void calculation(float x, float y) {	
		super.calculation(x, y);
		float c=x*y;
		System.out.println("Multiplication: "+c);
	}
	}

class Div extends mul{
	void calculation(int x, int y) {
		super.calculation(x, y);
		int c=x/y;
		System.out.println("Divison: "+c);
	}
	void calculation(float x, float y) {
		super.calculation(x, y);
		float c=x/y;
		System.out.println("Divison: "+c);
	}
}