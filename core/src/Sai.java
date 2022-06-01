import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Sai extends java.util.ArrayList<Integer>{
    static ArrayList<String> listNames = new ArrayList<>();


    public static void main(String[] args) {
        /*//object for Arraylist
        ArrayList nameList = new ArrayList();
        //create object for ArrayList for only integer
        Sai names = new Sai();*/
        StringBuffer sb = new StringBuffer("Hello");
        sb.append(1);
        sb.append("str");
        System.out.println(sb);
        StringBuffer yt = new StringBuffer(10);
        yt.insert(0, "sai");
        int i = yt.indexOf("a");
        System.out.println(i);

/*

        listNames.add("chaand");
        listNames.add("sai");
        listNames.add("kiran");
        listNames.add("purna");
        listNames.add("ponnam");
        listNames.add("soumith");
        listNames.add("Ajay");
        listNames.add("Srikanth");

        System.out.println(listNames);

*/


        /*names.add(10);
        names.add(31);
        names.add(13);
        nameList.add("ss");
        nameList.add("kk");
        nameList.add(11);
        Collections.sort(names);
        System.out.println("size of the collection: "+nameList.size());

        //nameList.addAll(listNames);

        if(listNames.containsAll(listNames)){
             System.out.println("collection is present");
        }
        if(listNames.isEmpty()){
            System.out.println("collection is empty");
        }
        if(listNames.contains("sai")){
            System.out.println("element is in collection");
        }
        System.out.println(listNames.size());
        Sai app = new Sai();
        //app.displayList(listNames);
        System.out.println("****names collection ****");
        app.displayList(names);
        System.out.println(nameList);
        System.out.println("********");
        listNames.add(2, "ila");
        System.out.println(listNames);
        System.out.println(listNames.get(2));
        nameList.addAll(1,listNames);
        System.out.println(nameList.lastIndexOf("kk"));
        System.out.println(nameList.indexOf("kk"));
        System.out.println(nameList);
        names.removeRange(1,3);
        System.out.println(names);


    }
    void displayList(ArrayList<Integer> names){
        System.out.println();
        for(int name : names){
            System.out.println(name);
        }
    }
    void removeList(int position){
        listNames.remove(position);
    }

    void removeByName(int name){
        listNames.remove(name);
    }*/
    }

}
