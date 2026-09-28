class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        
      ArrayDeque<Integer> q = new ArrayDeque<>();
        int[] ans = new int[nums.length - k + 1];
        int index = 0;

        // First window
        for (int i = 0; i < k; i++) {

            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            q.addLast(i);
        }

        ans[index++] = nums[q.peekFirst()];

        // Remaining windows
        for (int i = k; i < nums.length; i++) {

            // Remove element which is outside the window
            if (!q.isEmpty() && q.peekFirst() == i - k) {
                q.pollFirst();
            }

            // Remove smaller elements from the back
            while (!q.isEmpty() && nums[q.peekLast()] < nums[i]) {
                q.pollLast();
            }

            // Add current index
            q.addLast(i);

            // Front contains the maximum
            ans[index++] = nums[q.peekFirst()];
        }

        return ans;
    }
}