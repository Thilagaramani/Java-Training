package pac1;

public class CarMethodStatic {
 static String fuelType ="Diesel";
	//String fuelType="Diesel";
 //Static variable/method  can be called without referencing new object
	String seats;
	static  void run()
	{
		System.out.println("Car is running");
	}
	void stop()
	{
		System.out.println("Car stopped ");
	}

public static void main(String[] args)
	{
	    //String fuelType="Petrol";
		CarMethodStatic obj1=new CarMethodStatic();
		CarMethodStatic obj2=new CarMethodStatic();
		obj1.seats = "4";
		
		System.out.println("Seats "+obj1.seats);
		System.out.println("Fueltype is " +obj1.fuelType);
		System.out.println("Fueltype is " +fuelType);
		//static method called without creation new object for class
		run();
		//Normal method called by referencing new object
		obj1.stop();
		
	}
}


