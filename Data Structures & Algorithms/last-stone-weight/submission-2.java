class Solution {
    public int lastStoneWeight(int[] stones) {
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for(int num : stones){
            pq.add(num);
        }

        while(pq.size() > 1){

            int num2 = pq.poll();
            int num1 = pq.poll();

            if(num1 != num2){
                pq.offer(num2-num1);
            }
        }
        return pq.isEmpty() ? 0 : pq.poll();
    }
}
