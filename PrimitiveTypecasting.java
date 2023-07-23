class PrimitiveTypecasting 
{
	public static void main(String[] args) 
	{
		System.out.println("widening");
		double x = 20;
		System.out.println(x);
		double y = 20.56f;
		System.out.println(y);
		System.out.println("Narrowing");
		int a = (int)20.56;
		System.out.println(a);
		long b = (long)29.56f;
		System.out.println(b);

	}
}
