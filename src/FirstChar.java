import java.util.HashMap;
import java.util.Map;

public class FirstChar {

    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap();

        for(String s : strings){
            if(map.containsKey(s.substring(0,1))){
                String temp = map.get(s.substring(0,1));
                map.put(s.substring(0,1), temp + s);
            }
            else {
                map.put(s.substring(0,1), s);
            }

        }
        return map;
    }
}
