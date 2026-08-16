class Solution {
    int digit(int n)
    {
        int count =0;
        while(n>0){
        n = n/10;
        count++;
        }
        
        return count;
    }
    public int findNumbers(int[] nums) {
        int evncount = 0;
        int oddcount = 0;
      for(int i=0;i<nums.length;i++)
      {
        int count = digit(nums[i]);
        if(count%2==0)
        {
             evncount++;
             
        } 
    }
    return evncount;
}
}