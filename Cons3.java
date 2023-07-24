class Cons3 
{
	int std_id;
	String std_name;
	char std_grade;
	Cons3(int x, String y, char z)
	{
		std_id=x;
		std_name=y;
		std_grade=z;

	}
	public static void main(String[] args) 
	{
		Cons3 s1=new Cons3(1,"Dinga",'A');
		System.out.println(s1.std_id);
		System.out.println(s1.std_name);
		System.out.println(s1.std_grade);
	}
}

