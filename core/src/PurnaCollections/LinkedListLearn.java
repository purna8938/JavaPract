package PurnaCollections;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListLearn {

    public static void main(String[] args) {
        ArrayList<Integer> studentID = new ArrayList<>();
        ArrayList<String> studentNames = new ArrayList<>();
        for(int i=1; i<=10; i++){
            studentID.add(i);
        }
        System.out.println(studentID);
        System.out.println(studentID.get(0));
        studentNames.add("sai");
        studentNames.add("kiran");
        studentNames.add("purna");
        studentNames.add("ponnam");
        studentNames.add("srikanth");
        LinkedList<String> ll = new LinkedList<>();
        ll.addFirst("sdfs");
        ll.addAll(1,studentNames);
        ll.addLast("klj");
        System.out.println(ll);




    }
}
