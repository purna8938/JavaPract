package Collect;

import java.util.TreeSet;

class CustomizedSorting
{
    public static void main(String[] args)
{
    MyComparator m=new MyComparator();
    TreeSet t=new TreeSet(m);


    t.add(10);
    t.add(0);
    t.add(98);
    t.add(1);
    System.out.println(t);

}
}
