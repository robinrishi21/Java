class Hotels
{
	void rooms()
	{
		System.out.println("here is your room");
	}
}

class Customer
{
	static void needroom(Hotels h1)
	{
		h1.rooms();
	}
}



class OYO 
{
	public static void main(String[] args) 
	{
	  Hotels h1 = new Hotels();
	  Customer.needroom(h1);
	}
}
