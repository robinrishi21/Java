class Factorial8 
{
	int facto(int n)
	{
		int fact=1;
		for(int i=n; i>=1; i--)
		{
			fact=fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		System.out.println(new Factorial8().facto(8));
	}
}
