class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i= left ; i<=right;i++)
        {
            if(isSelfDividing(i))
            {
                result.add(i);
            }
        }
        return result;   
        
    }
    boolean isSelfDividing(int num)
    {
        if(num<=0)
        {
            return false;
        }
        int originalNum=num;
        while(num>0)
        {
             int digit = num%10;
             if(digit == 0 || originalNum % digit!=0)
             {
                return false;
             }
             num/=10;
        }
        return true;
    }
}