class Solution {
    public String getPermutation(int n, int k) {

        List<Integer> numbers = new ArrayList<>();
        int fact = 1;

        for (int i = 1; i < n; i++) {
            fact *= i;
        }

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }

        k--; // Convert to 0-based index

        StringBuilder ans = new StringBuilder();

        while (true) {

            ans.append(numbers.get(k / fact));
            numbers.remove(k / fact);

            if (numbers.isEmpty()) {
                break;
            }

            k %= fact;
            fact /= numbers.size();
        }

        return ans.toString();
    }
}