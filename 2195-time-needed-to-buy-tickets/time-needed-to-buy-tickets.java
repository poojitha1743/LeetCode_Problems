class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        ArrayDeque<Integer> q = new ArrayDeque<>();
        //put all the indeces in the queue
        for(int i=0;i<tickets.length;i++)
        {
            q.offer(i);
        }
        int turns = 0;
        //simulate as long as tickets[k]>0
        while(tickets[k]>0)
        {
            //pop from queue
           int front = q.poll();
            //serve him ticket
            tickets[front]-=1;
            if(tickets[front]>0)
            {
                q.add(front); // put him back in the queue
            }
            //increment the turns
            turns +=1;
        }
        return turns;
    }
}