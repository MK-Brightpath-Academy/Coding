class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>> triangle = new ArrayList<>();

        // Base case
        if (numRows == 0) return triangle;

        // First row
        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        // Build each row
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1); // first element

            // middle elements
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1); // last element

            triangle.add(currentRow);
        }

        return triangle;
    }
}