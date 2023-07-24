class Rev2 
{
	
	public static void main(String[] args) 
	{
		String s1 = "Rohit";
		String s2 = "";
		for(int i=4; i>=0; i--)
		{
            s2 = s2 + s1.charAt(i);
		}

		System.out.println(s2);
	}
}
