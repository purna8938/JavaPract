import java.util.ArrayList;
public class Sai {
    static ArrayList<String> listNames = new ArrayList<>();
    static ArrayList<Integer> names = new ArrayList<>();
    static ArrayList nameList = new ArrayList();
    public static void main(String[] args){
        listNames.add("chaand");
        listNames.add("sai");
        listNames.add("kiran");
        listNames.add("purna");
        listNames.add("ponnam");
        listNames.add("soumith");
        listNames.add("Ajay");
        listNames.add("Srikanth");
        names.add(10);
        names.add(12);
        names.add(13);
        nameList.add("ss");
        nameList.add("kk");
        nameList.add(11);
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
    }

}
