class Swap1 
{
	void swap(int a, int b)
	{
		int c=a;
		a=b;
		b=c;
		System.out.println(a);
		System.out.println(b);
	}
	public static void main(String[] args) 
	{
		new Swap1().swap(5,10);
	}
}
