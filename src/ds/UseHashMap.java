package ds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class UseHashMap {
    public static void main(String[] args) {
        Map<String, String> map = new LinkedHashMap<String, String>();
        map.put("USA", "NY");
        map.put("Canada", "Montreal");
        map.put("Japan", "Tokeyo");

        for (Map.Entry<String, String> data : map.entrySet()) {
            System.out.println(data.getKey() + " " + data.getValue());
        }
    }
}
