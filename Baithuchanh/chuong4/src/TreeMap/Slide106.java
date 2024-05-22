package TreeMap;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class Slide106 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        treeMap.put(6,'a');
        treeMap.put(6,'b');
        treeMap.put(6,'c');
        treeMap.put(6,'d');
        treeMap.put(6,'E');

        Set<Entry<Integer, Character>> setTreeMap = treeMap.entrySet();

        System.out.println("cac entry co trong setTreeMap");
        System.out.println(setTreeMap);
    }
}