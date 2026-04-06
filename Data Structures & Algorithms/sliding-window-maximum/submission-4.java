class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq = new ArrayDeque<>();

        for(int start = 0; start<nums.length-k+1;start++){

            while(!dq.isEmpty() && dq.peekFirst() < start){
                dq.removeFirst();
            }

            
            int loopStart = dq.isEmpty() ? start : dq.peekLast()+1;
            for(int i=loopStart;i<=start+k-1;i++){
                while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                    dq.removeLast();
                }
                dq.addLast(i);
            }
            nums[start] = nums[dq.peekFirst()];
        }
        return Arrays.copyOfRange(nums,0,nums.length-k+1);
    }
}
