import java.util.Scanner;

public class  Alphabet
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the Alphabet");
	char ch=s.next().charAt(0);
	
	

if((ch>='a' && ch<='z') || (ch>='A'&& ch<='Z'))
{
System.out.println("this is alaphabet");
}
else
{
System.out.println("this is not alaphabet");
}
}
}
