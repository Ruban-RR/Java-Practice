package codes;

class student
{
	private int number=32;
	
	void setValue(int n) 
	{
		number=n;
	}
	int getValue() 
	{
		return number;
	}
}
public class Encapsulation 
{
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		student s = new student();
		s.setValue(33);
		System.out.println(s.getValue());
	}

}