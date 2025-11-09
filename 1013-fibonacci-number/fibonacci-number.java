class Solution {
    public int fib(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int firstNumber=0;
            int secondNum=1;

            for(int i=0;i<n;i++){
                int thirdNumber=firstNumber+secondNum;
                firstNumber=secondNum;
                secondNum=thirdNumber;
            }
            return firstNumber;
        }

    }
}