package codingBat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class MoreY {

    public List<String> moreY(List<String> strings) {
        return strings.stream().map(a -> "y"+a+"y").collect(Collectors.toList());
    }

}
