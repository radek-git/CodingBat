package codingBat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Math1 {

    public List<Integer> math1(List<Integer> nums) {
        return nums.stream().map(a -> (a+1)*10).collect(Collectors.toList());
    }

}
