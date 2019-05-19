import java.util.HashMap;
import java.util.Map;

public class WordAppend {

    public String wordAppend(String[] strings) {
        Map<String, Integer> map = new HashMap();

        String result = "";

        for(int i=0; i<strings.length; i++){
            String s = strings[i];

            if(!map.containsKey(s)){
                map.put(s, 1);
            } else {
                int count = map.get(s);
                map.put(s, count + 1);
                if(map.get(s)!=1 && map.get(s)%2 == 0){
                    result = result + s;
                }
            }
        }
        return result;
    }
}
