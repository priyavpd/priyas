import java.util.Scanner;

public class Vowel
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the char");
	char ch=s.next().charAt(0);
	
	

if(ch=='a' ||ch=='e'|| ch=='i'||ch=='o'|| ch=='u'||ch=='A' ||ch=='E'|| ch=='I'||ch=='O'|| ch=='U')
{
System.out.println("this is vowel");
}
else
{
System.out.println("not vowel");
}
}
}
