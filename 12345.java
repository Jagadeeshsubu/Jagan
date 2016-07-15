import java.util.Arrays;
public class Sort_del {

	public static void main(String[] args) {
		char[] a=args[0].toCharArray();
		int n=args[0].length();
		int c=Integer.parseInt(args[1]);
		for(int i=0;i<n;i++)
		{
			Arrays.sort(a);	
		}
		int b;
		for(int j=0;j<c;j++)
		{
		   a[n-c+j]=0;
			System.out.print( a[j] );	
		}
	
	}
}
