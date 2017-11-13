class Solution {
    public int[] plusOne(int[] digits) {
        
        long num = 0;
        for(int i=0;i<digits.length;i++)
        {
            num = num*10 + digits[i];
        }
        
        num++;
        
        ArrayList<Integer> alist = new ArrayList<Integer>();
        while(num!=0)
        {
            long temp = num%10;
            alist.add((int)temp);
            num = num/10;
        }
        Collections.reverse(alist);
        int[] arr = new int[alist.size()];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=alist.get(i);
        }
        
        return arr;
    }
}