public class Binary_sort
{

	public static void main(String[] args)
	{
		int n=args.length;
		int b=0;
		int dec[]=new int[n];
		int c[]=new int[n];
		String bin[]=new String[n];
		for(int i=0;i<n;i++)
		{
			dec[i]=Integer.parseInt(args[i]);
			bin[i]=Integer.toBinaryString(dec[i]);
				}
		for( int i=0;i<n;i++)	{ c[i]=0;
			for(int j=0;j<bin[i].length();j++){
				char t = bin[i].charAt(j);
				if(t=='1'){
					c[i]=c[i]+1;
								}
			}
		
			for(i=0;i<n-1;i++)
			{
				for(int j=0;j<n-i-1;j++)
				{
					if(c[j]<c[j+1])
					{
						b=c[j];
						c[j]=c[j+1];
						c[j+1]=b;
						dec[j]=dec[j+1];
						dec[j+1]=b;
					}else if(c[j]==c[j+1]){
						{
							if(dec[j]<dec[j+1]){
								b=dec[j];
								dec[j]=dec[j+1];
								dec[j+1]=b;
							}
						}
					}
				}
			}
			for(i=0;i<dec.length;i++){
				System.out.println(dec[i]);
			}
		}
	}
}						
				
		
		
	
			
