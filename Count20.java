class Count20 
{
	int count(int n)
	{
		int count=0;
		while(n!=0)
		{
			int rem=n%100;
			if(rem==20)
			{
				count++;
			}
			n=n/100;	
		}
		return count;
	}
	public static void main(String[] args) 
	{
		System.out.println(new Count20().count(20142015));
	}
}
