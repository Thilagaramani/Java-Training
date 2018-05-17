package pac1;


/*1.interface is designed to inherit multiple class 
 * 2.base class method does not have body
 * 3.which means rules definition in base class implementation is child class
 * 4.All methods in base class should/must be implemented in child class
 */

interface bank 
{
	void deposit();
	void withdrawal();
}
interface mutualfunds
{
	void buy();
	void sell();
}

class HDFC implements bank 
{
	void getloan()
	{
		System.out.println("HDFC loan");
	}
	public void deposit()
	{
		System.out.println("HDFC deposit");
	}
	public void withdrawal()
	{
		System.out.println("HDFC withdrawal");
	}
}
class ICICI implements bank,mutualfunds 
{
	public void deposit()
	{
		System.out.println("ICICI deposit");
	}
	public void withdrawal()
	{
		System.out.println("ICIC withdrawal");
	}
	public void buy()
	{
		System.out.println("Buy ICICI mutual fund");
	}
	public void sell()
	{
		System.out.println("Sell ICIC mutual fund");
	}
}
	


public class Interface {

	public static void main(String[] args) {
		
		HDFC objH=new HDFC();
		objH.deposit();
		objH.withdrawal();
		objH.getloan();
		
		ICICI objI= new ICICI();
		objI.deposit();
		objI.buy();
		objI.sell();
		objI.withdrawal();
	
	}

}
