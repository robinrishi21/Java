class Resturant
{
	void food()
	{
		System.out.println("Food is Tasty");
	}
}
class Customer
{
	static void needfood(Resturant r1)
	{
		r1.food();
	}
}

class Zomato 
{
	public static void main(String[] args) 
	{
		Resturant r1 = new Resturant();
		Customer.needfood(r1);
	
	}
}
