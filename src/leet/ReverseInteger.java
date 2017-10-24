class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x<0)
        {
            isNegative = true;
        }
        x = Math.abs(x);
        
        try
        {
            int num = 0;
            while(x>0)
            {
                int a = x%10;
                num = Math.multiplyExact(num, 10) + a;
                x = x/10;
            }
            if(isNegative)
            {
                num *= -1;
            }
            
            return num;
        }
        catch(ArithmeticException ex)
        {
            return 0;
        }
        
    }
}