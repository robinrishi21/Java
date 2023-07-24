abstract class Sample
{
	abstract void mo();
	abstract void no();
}
abstract class Tester extends Sample
{
	void mo()
	{
		System.out.println("momo");
	}
}
class Developer extends Tester
{
	void no()
	{
		System.out.println("nono");
	}
}



class Main2 
{
	public static void main(String[] args) 
	{
		Developer d1 = new Developer();
		d1.mo();
		d1.no();
	}
}
