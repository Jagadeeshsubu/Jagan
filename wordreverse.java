import java.util.Scanner;
public class Word_reverse {

	public static void main(String[] args) {
		
		 Scanner s=new Scanner(System.in);
		 System.out.println("Enter the string");
		 String b=s.nextLine();
		String [] a=b.split(" ");
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]+" ");
		}

	}

}
