public class Odd_even {
	public static void main(String[] args)
	{
		int n = 0;
		int a=args.length;
		if(a==0)
		{
	System.out.println("Enter an integer");
		}
		else 
			n=Integer.parseInt(args[0]);
			if(n%2==0)
		{
			System.out.println("The given no is an even no");
		}
			else
			{
				System.out.println("The given no is odd no");
			}
	}

}
