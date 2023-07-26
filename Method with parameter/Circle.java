class Circle 
{
	static void area(int r)
	{
		final double pi = 3.14;
		double result = pi*r*r;
		System.out.println(result);
	}

	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		area(7);
		System.out.println("Main Ends");
	}
}
