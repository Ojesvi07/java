import java.util.Scanner;
public class code1
{
	public static void main (String args[])
	{
		System.out.println("Hello World!!");
		System.out.print("Welcome to java programming\nWhile loop\n");
		int a=0;
		while(a<=10)
		{
			System.out.println(a);
			a++;
		}
		do
		{
			System.out.println(a);
			a++;
		} while(a<10);
		for(;a>=0;a--)
		System.out.println(a);
		Scanner ob = new Scanner (System.in);
		a=ob.nextInt();
		System.out.println(a);
	}
}