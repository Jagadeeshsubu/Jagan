public class Seed {
public static void main(String[] args) {
	

	int a=Integer.parseInt(args[0]);
	int b=0;
	int num=0;
	for(int i=11;i<a/2;i++)
	{
		  b=i;
		int d=i;
		do
		{
		d=d*(b%10);
		b=b/10;
	
		if(d==a)
		{
			System.out.println(i+ "is the seed of" +a);
			num +=1;
		}}while(b>0)
	if(num==0)
		{
			System.out.println("No seed for" +a);
		}

	}
}
}

