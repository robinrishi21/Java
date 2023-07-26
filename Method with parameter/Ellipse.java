class Ellipse 
{
	static void area(int a, int b)
	{
		
		final double pi = 3.14;
		double result = pi*a*b;
		System.out.println(result);

	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		area(6,5);
		System.out.println("Main Ends");
	}
}
