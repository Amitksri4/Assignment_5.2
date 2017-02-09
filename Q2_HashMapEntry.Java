import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashMapEntry {

public static void main(String args[]) {
      
        Hashtable table = new Hashtable();
        table.put("Sony", "Bravia");
        table.put("Samsung", "Galaxy");
        table.put("Nokia", "Lumia");
      
        System.out.println("does hash table has Lumia as value : " + table.containsValue("Lumia"));
        System.out.println("does hash table Lumia as key : " + table.containsKey("Lumia"));
      

        String key= null;
        String value="Lumia";
        for(Map.Entry entry: table.entrySet()){
            if(value.equals(entry.getValue())){
                key = entry.getKey();
                break; //breaking because its one to one map
            }
        }
        System.out.println("got key from value in hashtable key:  "+ key +" value: " + value);
      
       
        table.put("HTC", "Lumia");
        Set keys = new HashSet();
      
        for(Map.Entry entry: table.entrySet()){
            if(value.equals(entry.getValue())){
                keys.add(entry.getKey()); //no break, looping entire hashtable
            }
        }
        System.out.println("keys : " + keys +" corresponding to value in hash table:  "+ value);
      
      
       
        HashMap map = new HashMap();
        map.put("one", 1);
        map.put("two", 2);
      
        
        Integer intValue=2;
        String strKey = null;
        for(Map.Entry entry: map.entrySet()){
            if(intValue.equals(entry.getValue())){
                strKey = entry.getKey();
                break; //breaking because its one to one map
            }
        }
      
        System.out.println("key from value in hash table key:  "+ strKey +" value: " + intValue);
    }
}


