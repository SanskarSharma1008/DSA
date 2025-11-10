class Solution {
    public int tribonacci(int n) {
        if(n==0){
            return 0;
        }
        else if(n==1){
            return 1;
        }
        else{
            int firstNumber =0;
            int secondNumber=1;
            int thirdNumber =1;

            for(int i=1;i<n;i++){
                int forthNumber=firstNumber + secondNumber + thirdNumber;
                firstNumber=secondNumber;
                secondNumber=thirdNumber;
                thirdNumber=forthNumber;
            }
            return secondNumber;
        }
    }
}