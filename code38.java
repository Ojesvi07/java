//pattern printing(printing (*) outside boundary of triangle)
import java.util.*;
class code38
{
    public static void main(String []arg)
    {
        int r,c;
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        r=ob.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<(2*r)-1;j++)
            {
                if(i+j>=r && j-i <=r-2)
                {
                    System.out.print(" ");
                }
                else
                {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}