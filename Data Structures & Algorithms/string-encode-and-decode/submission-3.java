class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strs.size(); i++) {
            sb.append(strs.get(i).length()).append('#').append(strs.get(i));
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> list = Arrays.asList(str.split(""));
        List<String> ds = new ArrayList<>();
        int i = 0;
        while (i < str.length()) {
            int j = indexOf("#", i);
            int length = Integer.parseInt(str.substring(i, j));
            String word = str.substring(j+1, j+1+length);
            i = j + 1 + length;
            ds.add(word);
        }
        return ds;
    }
}
