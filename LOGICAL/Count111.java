class Count111 
{
	int count(long n)
	{
		int count=0;
		while(n!=0)
		{
			long rem=(n%1000);
			if(rem==111)
			{
				count++;
			}
			n=n/1000;
		}
		return count;
	}
	public static void main(String[] args) 
	{
		  long no =222111442111l;
		System.out.println(new Count111().count(no));
	}
}
