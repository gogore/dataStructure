package algospot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class UniqueNumbers {
    public static Collection<Integer> findUniqueNumbers(Collection<Integer> numbers) {
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer i : numbers) {
            Integer integer = map.get(i);
            if (integer == null) {
                map.put(i, 1);
            } else {
                map.put(i, ++integer);
            }
        }
        Map<Integer, Integer> returnMap = new HashMap<>(map);
        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            if (map.get(key) > 1) {
                returnMap.remove(key);
            }
        }
        List<Integer> list = new ArrayList<>(returnMap.keySet());
        return list;
    }

    public static void main(String[] args) {
        Collection<Integer> numbers = Arrays.asList(1, 2, 1, 3);
        for (int number : findUniqueNumbers(numbers))
            System.out.println(number);
    }
}
