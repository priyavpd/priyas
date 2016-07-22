import java.util.Scanner;

public class  Biggestnum
{
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	System.out.println("enter the n1");
	int a=s.nextInt();
	System.out.println("enter the n2");
	int b=s.nextInt();
	System.out.println("enter the n3");
	int c=s.nextInt();
	
	

if((a>b)&&(a>c))
{
System.out.println("a is big");
}
else if(b>c)
{
System.out.println("b is big");
}
else
{
	System.out.println("c is big");
}
}
}
