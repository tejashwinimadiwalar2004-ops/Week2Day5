import java.util.HashMap;

public class Number {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 2, 3, 3, 3, 4};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : numbers) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        map.forEach((key, value) ->
            System.out.println(key + " -> " + value)
        );
    }
}