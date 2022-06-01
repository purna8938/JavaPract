package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapPract {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>();
        hm.put(1, "sai");
        hm.put(2, "sai");
        hm.put(3, "sai");
        hm.put(4, "sai");
        hm.put(5, "sai");
        hm.put(5,"kiran");
        System.out.println(hm.values());
        System.out.println(hm.keySet());
        System.out.println(hm.entrySet());
        System.out.println(hm.containsKey(3));
        System.out.println(hm.containsValue("sai"));
        System.out.println(hm.get(1));
        System.out.println(hm.remove(5));
        System.out.println(hm.putIfAbsent(6,"when"));
        System.out.println(hm);
        for (Map.Entry<Integer, String> me :
                hm.entrySet()) {

            // Printing keys
            System.out.print(me.getKey() + ":");
            System.out.println(me.getValue());
        }
        for (Integer sai: hm.keySet()) {
            System.out.println("has the sai");
        }


    }
}
