class Cons2 
{
	int emp_id;
	String emp_name;
	double emp_sal;
	Cons2(int x, String y, double z)
	{
		emp_id=x;
		emp_name=y;
		emp_sal=z;

	}
	public static void main(String[] args) 
	{
		Cons2 e1=new Cons2(1,"Dinga",5000.00);
		System.out.println(e1.emp_id);
		System.out.println(e1.emp_name);
		System.out.println(e1.emp_sal);
	}
}
