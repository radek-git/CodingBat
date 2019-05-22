package codingBat.functional1;

import java.util.List;
import java.util.stream.Collectors;

public class Square {

    public List<Integer> square(List<Integer> nums) {
        return nums.stream().map(number -> number*number).collect(Collectors.toList());
    }
}
