class Resturant
{
	void food()
	{
		System.out.println("menu list");
	}
}
class Veg extends Resturant
{
	void food()
	{
		System.out.println("Paneer");
	}
}
class Nonveg extends Resturant
{
	void food()
	{
		System.out.println("chicken biryani");
	}
}
class Chinese extends Resturant
{
	void food()
	{
		System.out.println("noodles");
	}
}
class Waiter
{
	static void serve(Resturant R1)
	{
		R1.food();
	}
}


class User 
{
	public static void main(String[] args) 
	{
		Veg v1 = new Veg();
		Nonveg m1 = new Nonveg();
		Chinese c1 = new  Chinese();
		Waiter.serve(v1);
		Waiter.serve(m1);
		Waiter.serve(c1);
	}
}
