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
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("#")) {
                int num = Integer.parseInt(list.get(i-1));
                ds.add(String.join("", list.subList(i+1, i+num+1)));
            }
        }
        return ds;
    }
}
