class Swap2 
{
	void swap(int a, int b)
	{
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);


	}
	public static void main(String[] args) 
	{
	   new Swap2().swap(5,10);
	}
}
