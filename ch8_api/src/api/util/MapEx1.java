package api.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapEx1 {
     public static void main(String[] args) {
          Map<String, String> map = new HashMap<>();

          map.put("id_01", "김아무개");
          map.put("id_02", "이아무개");
          map.put("id_03", "박아무개");
          map.put("id_04", "강아무개");
          map.put("id_05", "조아무개");
          map.put("id_06", "윤아무개");

          Set<String> set = map.keySet();
          Iterator<String> it = set.iterator();
          while (it.hasNext()) {
               String key = it.next();
               String value = map.get(key);
               System.out.println(key + " : " + value);
          }
     }
}
