class Solution {
    public String minWindow(String s, String t) {
        int minLength = Integer.MAX_VALUE;
        int min = 0;

        Map<Character, Integer> map = new HashMap<>();
        Map<Character, Integer> map1 = new HashMap<>();

        int need = 0;
        for (char ch : t.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            need++;
        }
        int have = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map1.put(ch, map1.getOrDefault(ch, 0) + 1);

            if (map.containsKey(ch) && map1.get(ch) <= map.get(ch)) {
                have++;
            }
          
            while (have == need) {
                if (minLength > i - start + 1) {
                    minLength = i - start + 1;
                    min = start;
                }
                char sh = s.charAt(start);
                if (map.containsKey(sh) && map1.get(sh) <= map.get(sh)) {
                    have--;
                }
                map1.put(sh, map1.get(sh) - 1);
                if (map1.get(sh) == 0) {
                    map1.remove(sh);
                }
                start++;
            }
        }
        // return min+"last" + minLength;
        if(minLength==Integer.MAX_VALUE)
        {
            return "";
        }
        return s.substring(min,min+minLength);
    }
}
