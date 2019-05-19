import java.util.HashMap;
import java.util.Map;

public class WordMultiple {

    public Map<String, Boolean> wordMultiple(String[] strings) {
        Map<String, Boolean> map1 = new HashMap();
        Map<String, Integer> map = new HashMap();

        for(int i=0; i< strings.length; i++){
            String s = strings[i];
            if(!map.containsKey(s)){
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
            }

            if(map.get(s) >= 2){
                map1.put(s, true);
            } else {
                map1.put(s, false);
            }
        }

        return map1;
    }

}
