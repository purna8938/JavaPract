package LearnSet;
import java.util.LinkedHashSet;

public class LearnLinkedHashset {
    public static void main(String[] args) {
        LinkedHashSet<Sai> fh = new LinkedHashSet<Sai>();
        /*fh.add("sai");
        fh.add(null);*/
        System.out.println(fh.size());
        if(fh.contains("sai")){
            System.out.println("element is present");
        }else{
            System.out.println("element is not empty");
        }
        if(!fh.isEmpty()){
            System.out.println("collection is not empty");
        }else{
            System.out.println("collection is not empty");
        }
    }
}
