//to use ArrayList class and see methods of printing different functions
import java.util.*;
import java.lang.*;
public class arraylist
{
    public static void main(String []arg)
    {
        ArrayList <Integer>ob= new ArrayList<Integer>();
        ob.add(2);
        ob.add(5);
        ob.add(7);
        ob.add(9);
        ob.add(1,66);               //to add value at specific index.
        //ob.add(10,20);            //will give excption as array size is less than 10 so it cannot add element at index10.
        System.out.println("\nPrinting integer array using foreach loop");
        for(Integer k:ob)
        {
            System.out.println(k);
        }
        System.out.println("Integer Array");
        System.out.print(ob);
        System.out.println("\nSize of Integer Array: "+ob.size());
        System.out.println("\nIndex of: "+9 +" is " +ob.indexOf(9));
        ArrayList <String>ob1= new ArrayList<String>();
        ob1.add("ABC");
        ob1.add("DEF");
        ob1.add("GHI");
        System.out.println("\n\nPrinting string array using foreach loop");
        for(String j:ob1)
        {
            System.out.println(j);
        }
        System.out.println("String Array");
        System.out.println(ob1);
        ArrayList <Double> ob2 = new ArrayList<Double>();
        ob2.add(11.22);
        ob2.add(22.33);
        ob2.add(33.44);
        System.out.println("\nPrinting double array using foreach loop");
        for(Double i:ob2)
        {
            System.out.println(i);
        }
        System.out.println("Double Array");
        System.out.println(ob2);
    }
}