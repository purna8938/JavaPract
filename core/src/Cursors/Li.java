package Cursors;

import java.util.ArrayList;
import java.util.ListIterator;

public class Li {
    public static void main(String[] args) {
        ArrayList<Object> sai = new ArrayList<Object>();
        for (int i = 0; i <= 10; i++) {
            sai.add(i);
        }
        if(sai.listIterator().hasNext()){
            System.out.println("has enter elements");
        }
        if(sai.listIterator(5).hasPrevious()){
           System.out.println("has element");
        }
        //sai.listIterator().add(98);
        ListIterator<Object> snp = sai.listIterator();

        System.out.println(snp);
        System.out.println(snp.hashCode());
        /*snp.add(45);
        snp.add(34);
        snp.add(26);
        System.out.println(snp);
        while (snp.hasNext()){
            int ng = (int) snp.next();
            System.out.println(ng);
        }
        while (snp.hasPrevious()){
            snp.set(11);
            //snp.add(34);
            int sk = (int) snp.previous();
            System.out.println(sk);
            //System.out.println(snp.previousIndex());
        }*/

        /*for (Object i : sai ){
            System.out.println(i);
        }
*/
    }

}
