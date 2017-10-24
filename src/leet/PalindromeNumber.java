class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        if(x<0)
        {
            return false;
        }
        
        if(x>0 && x<10)
        {
            return true;
        }
        
        
        try
        {
            int num = 0;
            while(x>0)
            {
                int a = x%10;
                num = Math.multiplyExact(num, 10) + a;
                x = x/10;
            }
            
            if(num==y)
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        catch(ArithmeticException ex)
        {
            return false;
        }
        
    }
}