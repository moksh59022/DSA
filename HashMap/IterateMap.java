package HashMap;

import java.util.HashMap;

public class IterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",10);
        map.put("B",20);
        map.put("C",30);
        map.put("D",40);
        map.put("E",50);
//        System.out.println(map);
        for ( String key : map.keySet()){
            int val = map.get(key);
            System.out.println(key+" "+val);
        }

        System.out.println();

        for (int val : map.values()){
            System.out.println(val);
        }
        System.out.println();

        for (Object pair : map.entrySet()){
            System.out.println(pair);
        }
    }
}
