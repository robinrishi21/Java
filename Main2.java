class Vehicle
{
	void stand()
	{
		System.out.println("Standing");
	}
}
class Bike extends Vehicle
{
	void run()
	{
		System.out.println("Running");
	}
}



class Main2 
{
	public static void main(String[] args) 
	{
		System.out.println("***Upcasting***");
		Vehicle v1 = new Bike();
		v1.stand();
		System.out.println("***Downcasting***");
		Bike b1 = (Bike) v1;
		b1.stand();
		b1.run();


	}
}
