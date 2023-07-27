class Chips
{
	void bananachips()
	{
		System.out.println("here is your chips");
	}
}
class Customer
{
	static void needchips(Chips c1)
	{
		c1.bananachips();
	}
}


class Grofers 
{
	public static void main(String[] args) 
	{
		Chips c1 = new Chips();
		Customer.needchips(c1);
		
	}
}
