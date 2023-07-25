class Pattern
{
	void pattern1(int r,int c)
	{
		for(int i=1; i<=r; i++)
		{
			for(int j=1; j<=c; j++)
			{
				System.out.print("*");

			}
			System.out.println();
		}

	}

	void pattern2(int r,int c)
	{
		for(int i=1; i<=r; i++)
		{
			for(int j=c; j>=i; j--)
			{
				System.out.print(j);

			}
			System.out.println();

		}

	}
	void pattern3(int r,int c)
	{
		for(int i=r; i>=1; i--)
		{
			for(int j=1; j<=c; j++)
			{
				System.out.print(i);
			}
			System.out.println();
		}
	}

	void pattern4(int r,int c)
	{
		for(int i=1; i<=4; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();

		}
	}
	void pattern5(int r,int c)
	{
		for(int i=r; i>=1; i--)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j);
			}
			System.out.println();

		}
	}










}




class Main 
{
	public static void main(String[] args) 
	{
		Pattern s1 = new Pattern();
		s1.pattern1(3,3);
		s1.pattern2(4,4);
		s1.pattern3(4,4);
		s1.pattern4(4,4);
		s1.pattern5(4,4);


	}
}
