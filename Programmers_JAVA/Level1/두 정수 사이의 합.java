class Solution {
    public long solution(int a, int b) {

        long answer = 0;
        long total = 0;

        if(a>b){
            int temp=0;
            temp = a;
            a = b;
            b = temp;
        }

        for(int start = a ; start <=b ; start++){
            total+=start;
        }
        return total;



    }
}

/**
 * class Solution {
 *
 *     public long solution(int a, int b) {
 *         return sumAtoB(Math.min(a, b), Math.max(b, a));
 *     }
 *
 *     private long sumAtoB(long a, long b) {
 *         return (b - a + 1) * (a + b) / 2;
 *     }
 * }
 *
 *
 * **/