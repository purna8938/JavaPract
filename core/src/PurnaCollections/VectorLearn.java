package PurnaCollections;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.stream.Collectors;

public class VectorLearn {
    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("a");
        al.add("i");
        Vector<String> vl= new Vector<>(al);
        System.out.println(vl);
        List<String> collect = vl.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(collect);

    }
}
