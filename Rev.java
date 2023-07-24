class Rev 
{
	int emp_id;
	String name;
	int emp_sal;
	Rev(int emp_id, String name, int emp_sal)
	{
		this.emp_id = emp_id;
		this.name = name;
		this.emp_sal = emp_sal;

	}
	public static void main(String[] args) 
	{
		Rev s1=new Rev(1,"Dinga",5000);


		System.out.println(s1.emp_id);
		System.out.println(s1.name);
		System.out.println(s1.emp_sal);

	}
}
