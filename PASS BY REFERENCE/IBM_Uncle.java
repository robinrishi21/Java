class IBM_Aunty
{
	void job()
	{
		System.out.println("Software engineering job");
	}
}
class Dinga
{
	static void needjob(IBM_Aunty a1)
	{
		a1.job();

	}
}
class Dingi
{
	static void needjob(IBM_Aunty a1)
	{
		a1.job();

	}
}



class  IBM_Uncle
{
	public static void main(String[] args) 
	{
		IBM_Aunty a1 = new IBM_Aunty();
		Dinga.needjob(a1);
		Dingi.needjob(a1);
	}
}
