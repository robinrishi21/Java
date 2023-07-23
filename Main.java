class Sample
{
	void mo()
	{
		System.out.println("momo");
	}
}

class Demo extends Sample
{
	void fo()
	{
		System.out.println("fofo");
	}
}




class Main 
{
	public static void main(String[] args) 
	{
		System.out.println("***Upcasting****");
		Sample s1 = new Demo();
		s1.mo();
		System.out.println(s1);
		System.out.println("***Downcasting****");
	
		Demo d1 = (Demo)s1;
			System.out.println(d1);
		d1.mo();
		d1.fo();

	}
}
