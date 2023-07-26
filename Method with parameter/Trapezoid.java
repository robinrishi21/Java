class Trapezoid 
{
	static void area(int a, int b, int h)
	{
		
		double result = 0.5*(a+b)*h;
		System.out.println(result);

	}
	public static void main(String[] args) 
	{
		System.out.println("Main Starts");
		area(5,6,8);
		System.out.println("Main Starts");
	}
}
