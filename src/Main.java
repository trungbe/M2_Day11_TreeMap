import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Trung");
        treeMap.put(2, "lan");
        treeMap.put(3, "vu");
        treeMap.put(4, "cuong");
        System.out.println("Display entries in TreeMap");
        System.out.println(treeMap + "\n");

    }
}
