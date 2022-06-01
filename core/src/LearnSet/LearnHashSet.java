package LearnSet;

import java.util.Arrays;
import java.util.HashSet;

public class LearnHashSet {
    public static void main(String[] args) {
        HashSet mp = new HashSet();
        mp.add(56);
        mp.add(45);
        mp.add(76);
        mp.add(34);
        mp.add(89);
        mp.add(34);
        System.out.println(mp);
        mp.addAll(Arrays.asList(new Integer[] {0,1,2,3,4,5}));
        System.out.println(mp);

    }
}
