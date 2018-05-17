package pac1;

public class CallByValueReference {
	
	int a = 10;

	public static void main(String[] args) {
		
		CallByValueReference obj = new CallByValueReference();
		
		// call by value.
		// original value of the variable is not changed value 10 is passed here 
		obj.callByValue(obj.a);
		System.out.println("a = " + obj.a);
		
		// call by reference
		obj.callByReference(obj);
		// original value of the variable is changed
		System.out.println("a = " + obj.a);
		
		
	}
	
	public int callByValue(int x)
	{
		//x = 20;
		System.out.println("x = " + x);
		return x;
	}
	
	public void callByReference(CallByValueReference obj)
	{
		obj.a = 30;
	}
}
