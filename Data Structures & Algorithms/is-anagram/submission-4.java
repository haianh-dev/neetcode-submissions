class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (s.indexOf(c) == -1) return false;
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        for (char c: t.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        for (Character key: map.keySet() ) {
            if (map.get(key)%2!=0) return false;
        }
        return true;
    }
}
