//to remove consective characters if they are same to the given character(inputed by user)
import java.util.*;
class code45
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
	
        StringBuffer s3=new StringBuffer();
        System.out.println("Enter the string:");
        s3.append(ob.nextLine());
         char ch;
        System.out.print("Enter the character user wants to check repition for:\n");
        ch=ob.next().charAt(0);
       StringBuffer s4=new StringBuffer();
       s4=newstring(s3,ch);
        System.out.println("New String after removal of character:");
        System.out.println(s4);
        
         
    }
    public static StringBuffer newstring(StringBuffer s3,char x)
    {
     
        for(int i=0;i<s3.length();i++)
        {
		if(i+1<=s3.length())
		{

		    if(s3.charAt(i)==x && s3.charAt(i+1)==x)
		 {
		      s3.deleteCharAt(i+1);

			i--;
			

		    }

		}

}
        return s3;

    }
}
