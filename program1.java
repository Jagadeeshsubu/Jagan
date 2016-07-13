public class Test1
{
	public static void main(String[] args)
	{
		int n;
		int a=args.length;
		if(a==0)
		{
	System.out.println("Enter an integer");
		}
		else {
			n=Integer.parseInt(args[0]);
			if(n>0)
			
		{     
System.out.println(n+ " is a positive number");
		}
		else if(n<0)
		{
			System.out.println(n+ " is a negative number");
		}
		else if(n==0)
		{
			System.out.println(n+ " is ZERO");
		}
	}

}}
