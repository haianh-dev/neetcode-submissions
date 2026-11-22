class Solution {
    public boolean isValidSudoku(char[][] board) {
        List<Set<Character>> rows = new ArrayList<>();
        List<Set<Character>> cols = new ArrayList<>();
        List<Set<Character>> boxes = new ArrayList<>();

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            boxes.add(new HashSet<>());
        }

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Character val = board[i][j];
                if (val == '.') continue;
                int box_idx = (i / 3)*3 + (j / 3);
                if (rows.get(i).contains(val) || cols.get(j).contains(val) || boxes.get(box_idx).contains(val)) {
                    return false;
                }
                else {
                    rows.get(i).add(val);
                    cols.get(j).add(val);
                    boxes.get(box_idx).add(val);
                }
            }
        }
        return true;

    }
}
