class Travelagency
{
	void trips()
	{
		System.out.println("Lets make your trip awesome");
	}
}

class Customer
{
	static void needtravel(Travelagency t1)
	{
		t1.trips();
	}
}


class MakemyTrip 
{
	public static void main(String[] args) 
	{
		Travelagency t1 = new Travelagency();
		Customer.needtravel(t1);
	}
}
