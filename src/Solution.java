import java.util.HashMap;
import java.util.Map;

public class Solution {

    static Map<String, Integer> values = new HashMap<>();

    static {
        values.put("I", 1);
        values.put("V", 5);
        values.put("X", 10);
        values.put("L", 50);
        values.put("C", 100);
        values.put("D", 500);
        values.put("M", 1000);
        values.put("IV", 4);
        values.put("IX", 9);
        values.put("XL", 40);
        values.put("XC", 90);
        values.put("CD", 400);
        values.put("CM", 900);
    }

    public int romanToInt(String input) {
        int sum = 0;
        int i = 0;

        while (i < input.length()) {
            // Assumption: minimum two characters in input string present
            if (i < input.length() - 1) {
                String twoSymbolCombi = input.substring(i, i + 2);
                // Chek if the twoSymbolCombi is present in the values Hashmap
                if (values.containsKey(twoSymbolCombi)) {
                    // update sum with corresponding combi value
                    sum += values.get(twoSymbolCombi);
                    // increment i by two values i.e. legth of combi
                    i = i + 2;
                    continue;
                }
            }
            String oneSymbol = input.substring(i, i + 1);
            // update sum with corresponding single value
            sum += values.get(oneSymbol);
            i = i + 1;
        }
        return sum;
    }
}
