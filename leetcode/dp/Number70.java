class Number70 {
    public int climbStairs(int n) {
        int  left = 2 , right = 3;
        if(n <= 3){
            return n;
        }
        for(int i  = 3, temp; i < n; i++){
            temp  = right;
            right = right + left;
            left = temp;
         }
         return right;
    }
}