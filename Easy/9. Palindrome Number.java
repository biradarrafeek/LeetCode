class Solution {
    public boolean isPalindrome(int x) {
        if(x==0 ){
            return true;
        }
        if(x<0 || x%10==0){
            return false;
        }
        int y=0;
        while(x>y){
            int ans=x%10;
            x/=10;

            y=(y*10)+ans;
        }
        if(x==y || x==y/10){
            return true;
        }
        else{
            return false;
        }
}
}
