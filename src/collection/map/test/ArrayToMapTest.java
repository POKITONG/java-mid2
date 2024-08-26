package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {
    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        // 주어진 배열로부터 Map 생성

        Map<String, String> map = new HashMap<>();
        for (String[] strings : productArr) {
            map.put(strings[0], strings[1]);
        }

        for (String string : map.keySet()) {
            System.out.println("제품: " + string + ", 가격: " + map.get(string));
        }
    }
}
