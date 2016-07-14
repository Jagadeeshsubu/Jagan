import java.util.Scanner;
public class Vowels {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter the alphabet");
	String a =scan.next();
	if( a.equals("a")||a.equals("e")||a.equals("i")||a.equals("o")||a.equals("u")||a.equals("A")||a.equals("E")||a.equals("I")||a.equals("O")||a.equals("U"))
	{
		System.out.println("The given char is a vowel");
	}
	else{
			System.out.println("The given char is a consonant");
		}
	}}
