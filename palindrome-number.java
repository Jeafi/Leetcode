class Solution {
    public boolean isPalindrome(int x) {
     if(x < 0)
     {
         return false;
     }
        int  rev =0 ;
        int y = x;
    while(y != 0)
    {
       int temp = y % 10;
        rev = rev *10 + temp ;
        y = y/10;
    }
        if (x == rev)
        {return true;}
        return false;
    }
}