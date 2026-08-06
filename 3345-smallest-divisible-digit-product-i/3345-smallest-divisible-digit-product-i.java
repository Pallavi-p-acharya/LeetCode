class Solution {
    public int smallestNumber(int n, int t) {
        int temp=n,product=1;
        while(temp!=0){
            int digit=temp%10;
            product*=digit;
            temp/=10;
        }
        if(product%t==0){
            return n;
        }else{
        while(product%t!=0){
                n++;
                temp=n;
                product=1;
                while(temp!=0){
                int digit=temp%10;
                product*=digit;
                temp/=10;
        }
        }
        }
        return n;
    }
    }
