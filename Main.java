abstract class Demo
{
	abstract void fo();
}

class Memo extends Demo
{
	void fo()
	{
		System.out.println("fofo");
	}
} 






class  Main
{
	public static void main(String[] args) 
	{
		Memo m1 = new Memo();
		m1.fo();

		
	}
}
