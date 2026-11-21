class Solution {
    public boolean isAnagram(String s, String t) {
        Map<String, Integer> map = new HashMap<>();
        for (char c: s.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        for (char c: t.toCharArray()) {
            if (!map.containsKey(c)) map.put(c, 1);
            else map.put(c, map.get(c) + 1);
        }
        for (String key: map.keySet() ) {
            if (map.get(key)%2!=0) break;
            return false; 
        }
        return true;
    }
}
