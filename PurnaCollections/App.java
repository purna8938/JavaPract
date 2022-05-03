import java.util.*;

public class App{
    static ArrayList<String> listNames = new ArrayList<>();
    public static void main(String[] args){
        listNames.add("chaand");
        listNames.add("sai");
        listNames.add("kiran");
        listNames.add("purna");
        listNames.add("ponnam");
        listNames.add("soumith");
        listNames.add("Ajay");
        listNames.add("Srikanth");
//System.out.println(listNames.get(0));
        App app = new App();
        app.displayList(listNames);
    }
    void displayList(ArrayList<String> names){
        for(String name: names){
            System.out.println(name);
        }
    }

    void removeNamePosition(int position){
        listNames.remov

    }
}