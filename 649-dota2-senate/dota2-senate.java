class Solution {
    public String predictPartyVictory(String senate) {
       ArrayDeque<Integer> r = new ArrayDeque<>();
       ArrayDeque<Integer> d = new ArrayDeque<>();
       for(int i=0;i<senate.length();i++)
       {
         if(senate.charAt(i)=='R')
         {
            r.offer(i);
         }
         else
         {
            d.offer(i);
         }
       }
        int n=senate.length(); 
       while(!r.isEmpty() && !d.isEmpty())
       {
        if(r.peek()<d.peek())
        {
            d.poll();
            r.offer(r.poll()+n);
        }
        else
        {
            r.poll();
            d.offer(d.poll()+n);
        }
       }
       return r.isEmpty() ? "Dire" : "Radiant";
    }
}