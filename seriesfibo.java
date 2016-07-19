
public class Fibonacci {

	public static void main(String[] args) {

	    int input1 =Integer.parseInt(args[0]);
		  int []c=new int [input1+2];
		  	   int []d=new int [input1+2];
	   c[0]=0;
	   c[1]=1;
	   c[2]=1;
	  for(int i=0;i<input1;i++)
	 {
	if(i==0||i==1||i==2)
	  {
	  d[i]=c[i];
	}
		else
		  {
		  c[i]=d[i-1]+d[i-2];
		  d[i]=c[i];
		}
		System.out.println(d[i]);
	  }		

	    }

	}


