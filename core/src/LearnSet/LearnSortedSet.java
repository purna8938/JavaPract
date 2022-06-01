package LearnSet;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class LearnSortedSet implements Comparator {
    LearnSortedSet l1 = new LearnSortedSet();
    public static void main(String[] args) {
        SortedSet ts = new TreeSet();
        ts.add("sai");
        ts.add("kiran");
        ts.add("ponnam");
        ts.add("purna");
        ts.add("man");
        //System.out.println(ts.clone().equals("sai"));
        //TreeSet sp = (TreeSet) ts.subSet(2,4);
        System.out.println(ts);
       // TreeSet<Object> st =  new TreeSet<>(ts);
        LinkedHashSet ast = new LinkedHashSet();
        ast.add(23);
        ast.add(34);
        ast.add(54);
        ast.add(12);
        System.out.println(ast);
        TreeSet<Object> st =  new TreeSet<>(ast);

        System.out.println(st);



    }

    @Override
    public int compare(Object o1, Object o2) {
        return 0;
    }

    @Override
    public Comparator reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator thenComparing(Comparator other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public Comparator thenComparingInt(ToIntFunction keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator thenComparingLong(ToLongFunction keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator thenComparingDouble(ToDoubleFunction keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }

    @Override
    public Comparator thenComparing(Function keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator thenComparing(Function keyExtractor, Comparator keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }
}
