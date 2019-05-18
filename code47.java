//making left trim and right trim functions manually
import java.util.*;
class code47
{
    public static void main(String arg[])
    {
        Scanner ob=new Scanner(System.in);
       	
        System.out.println("Enter the string:");

	StringBuffer s1=new StringBuffer(ob.nextLine());
         StringBuffer s2=lefttrim(s1);
	System.out.println("After leftrim: ");
	System.out.println(s2);
	StringBuffer s3=righttrim(s2);
	System.out.println("After righttrim: ");
	System.out.println(s3);
	}
//lefttrim function
public static StringBuffer lefttrim(StringBuffer s1)
{
        for(int i=0;i<s1.length();i++)
        {
		 if(s1.charAt(i)==' ')
		{
			s1.deleteCharAt(i);
			i--;
		}
		else
		{
			break;
		}
	}
return s1;
}
//righttrim function
public static StringBuffer righttrim(StringBuffer s2)
{
int count=0;
int k=0;
        for(int i=0;i<s2.length();i++)
        {
			if (s2.charAt(i)!=' ')
		{
			k=i;
			
		}
	}
//System.out.println("k="+k);

	for(int j=k+1;j<s2.length();j++)
	{
		if(s2.charAt(j)==' ')
		{
			s2.deleteCharAt(j);
		}
	}

return s2;
}

}
