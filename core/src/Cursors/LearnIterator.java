package Cursors;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LearnIterator {
    public static void main(String[] args) {

        ArrayList<Integer> sai = new ArrayList<Integer>();
        for (int i = 0; i <= 10; i++) {
            sai.add(i);
        }
        LinkedList<Object> sm = new LinkedList<Object>();
        sm.add(0,13);
        sm.add(1,"sai");

        System.out.println(sai);
        Iterator<Integer> sk = sai.iterator();
        Iterator<Object> tr = sm.iterator();
        System.out.println(sk.next());
        while (sk.hasNext()){
            int num = sk.next();
            System.out.println(num);
        }
        System.out.println(tr.next());
        tr.remove();
        System.out.println(tr);



    }

}
