class Medical
{
	void medicine()
	{
		System.out.println("Here is your Medicine");
	}
}

class Customer
{
	static void needmedicine(Medical m1)
	{
		m1.medicine();
	}
}





class Netmeds 
{
	public static void main(String[] args) 
	{
		Medical m1 = new Medical();
		Customer.needmedicine(m1);
		
	}
}
