class Column 
{
	
	public static void main(String[] args) 
	{
		int no=1;
	    char ch='A';
		for (int i=1;i<=5 ;i++ )
		{
			for (int j=1;j<=4 ;j++ )
			{
				if(j==1)
				{
					System.out.print(""+ch);
				}
				if(j==2)
				{
					System.out.print(""+no);
				}
				if(j==3)
				{
					System.out.print(ch+=5);
				}
				if(j==4)
				{
					System.out.print(no+=5);
				}

			}
			ch-=4;
			no-=4;
			System.out.println();
		}
	}
}
