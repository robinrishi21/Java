class Armstrong1 
{
	void Armstrong(int n)
	{
		int sum=0;
		int copy=n;
		while(n!=0)
		{
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		if(copy==sum)
		{
			System.out.println("its an Armstrong no");
		}
		else {
			System.out.println("its not an Armstrong no.");
		}


	}
	public static void main(String[] args) 
	{
		new Armstrong1().Armstrong(173);
	}
}
