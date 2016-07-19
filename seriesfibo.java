public class Fibonacci {

	public static void main(String[] args) {

	    int input1 =Integer.parseInt(args[0]);
		  int []a=new int [input1+2];
		  	   int []b=new int [input1+2];
	   a[0]=0;
	   a[1]=1;
	   a[2]=1;
	  for(int i=0;i<input1;i++)
	 {
	if(i==0||i==1||i==2)
	  {
	  b[i]=a[i];
	}
		else
		  {
		  a[i]=b[i-1]+b[i-2];
		  b[i]=a[i];
		}
		System.out.println(b[i]);
	  }		

	    }

	}
