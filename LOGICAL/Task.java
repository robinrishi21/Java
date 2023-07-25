class  Task
{
	static int sumofdigit(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
	}
		static int sumofsquare(int n)
	{
		int sum=0;
		while(n!=0)
		{
			int rem = n%10;
			sum=sum+(rem*rem);
			n=n/10;
		}
		return sum;
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		int[] arr = {120,143,205,222};
		int sumofeven=0;
		int sumofodd=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sumofeven = sumofeven + sumofdigit(arr[i]);
			}
			else 
			{
				sumofodd = sumofodd + sumofsquare(arr[i]);
			}
		}
		int sum2 = sumofdigit(sumofodd);
		System.out.println(sumofeven);
		System.out.println(sumofodd);
		System.out.println(sum2);
		int sum3 = sumofeven * sum2;
		System.out.println(sum3);

	}
}
