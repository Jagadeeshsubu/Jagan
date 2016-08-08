
public class Str12 {
	public static void main(String[] args) {
		String First_Name=args[0];
		String Last_Name=args[1];
		String smaller="";
		String larger="";
		int pin=631652;
		int n=3;
		String a="";
		String g="";
		String h=a.valueOf(pin);
		int x=First_Name.compareToIgnoreCase(Last_Name);
		if(x>0){
			smaller=First_Name;
			larger =Last_Name;	
			}
		else{		
			smaller=Last_Name;
		    larger=First_Name;
		}
			String s=smaller.substring(smaller.length()-1);
		     s=s+larger;
			String c=h.substring(n-1,n);
			String d=h.substring(h.length()-n,h.length()-(n-1));
			s=s+c+d;
			System.out.println(s);
			char[] ch=new char[s.length()];
	
			for(int i=0;i<s.length();i++)
			{
				ch[i]=s.charAt(i);
			  if( Character.isLowerCase(ch[i]))
			   {
			      ch[i]=Character.toUpperCase(ch[i]);
			   }
			  else{
				  ch[i]=Character.toLowerCase(ch[i]);
			   }
			}
			g=g.valueOf(ch);
			System.out.println(g);
			}
		}
