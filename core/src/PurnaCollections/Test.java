package PurnaCollections;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

    public static void main(String[] args) {
        Vector<Object> v = new Vector<Object>();
        for (int i = 0; i <= 10; i++) {
            v.add(i);
        }
        Enumeration<Object> e = v.elements();
        while (e.hasMoreElements()) {

            int num = (int) e.nextElement();
            System.out.println(num);
        }
    }

}
