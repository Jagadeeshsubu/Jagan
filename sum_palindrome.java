public class Sum_palindrome {

	
	public static void main(String[] args) {
	
			int a=Integer.parseInt(args[0]);
			int c;
			int sum=0;
			while(a==0)
			{
				sum=a%10; 
				c=sum;
				sum=sum+c;
				a=a/10;			
			}
			
			StringBuffer str= new StringBuffer(sum);
			str.reverse();
		    if(str.toString().equals(sum))
					{
						System.out.println("The given sting is a Palindrome");
					}else
					{
						System.out.println("The given string is not a palindrome");
					
			}}


		}

