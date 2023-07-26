class Sector 
{
	static void area(int r,double deg)
	{
		double result = 1/2d*r*r*deg;
		System.out.println(result);

	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		area(7,30.0);
		System.out.println("Main Ends");
	}
}
