public class Seed {
public static void main(String[] args) {
	

	int a=Integer.parseInt(args[0]);
	int b=0;
	int count=0;
	for(int i=11;i<a/2;i++)
	{
		  b=i;
		int c=i;
		while(b>0){
		c=c*(b%10);
		b=b/10;
	
		if(c==a)
		{
			System.out.println(i+ "is the seed of" +a);
			count +=1;
		}}
	if(count==0)
		{
			System.out.println("No seed for" +a);
		}

	}
}
}
