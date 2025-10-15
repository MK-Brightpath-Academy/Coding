class Solution {
    public List<Integer> getRow(int rowIndex) {
         List<Integer> row = new ArrayList<>();
        row.add(1); // First row always starts with 1

        for (int i = 1; i <= rowIndex; i++) {
            // Update the row from right to left
            for (int j = i - 1; j > 0; j--) {
                row.set(j, row.get(j) + row.get(j - 1));
            }
            row.add(1); // Last element is always 1
        }
        return row;
    }
}