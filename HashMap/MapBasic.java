package HashMap;

import java.util.HashMap;

public class MapBasic {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",76);
        map.put("B",83);
        map.put("C",13);
        map.put("D",82);
        map.put("E",88);
        System.out.println(map+" "+map.size());
        map.put("F",100);
        System.out.println(map+" "+map.size());
        map.put("G",76);
        map.remove("A");
        System.out.println(map+" "+map.size());
        map.remove("B");
        System.out.println(map+" "+map.size());

    }
}
