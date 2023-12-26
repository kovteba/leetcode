class Solution {
    public int romanToInt(String s) {
          int result = 0;
        
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);

        String[] split = s.split("");
        for (int i = split.length - 1; i >=0; i--) {
            Integer value = map.get(split[i]);
            if (i != split.length - 1 ) {
                if (value < map.get(split[i + 1])) {
                    result -= value;
                } else {
                    result += value;
                }
            } else {
                result += value;
            }
        }
        return result;
    }
}