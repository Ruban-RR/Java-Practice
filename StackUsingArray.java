package javaPrac;

public class StackUsingArray {
	int top = -1;
	int arr[] = new int[1000];

    
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    // Your code here
    	top +=1;
    	int maxPostition = top;
	    arr[maxPostition]=a;
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
        // Your code here
		if(top==-1) {
			return -1;
		}else {
			int topElem = arr[top];
			top-=1;
			return topElem;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 8;
		int c = 10;
		StackUsingArray s = new StackUsingArray();
		s.push(a);
		s.push(b);
		s.push(c);
		System.out.println(s.pop());
		System.out.println(s.pop());

	}

}
