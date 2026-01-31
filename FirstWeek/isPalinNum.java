class UserMainCode {
    public int isPalinNum(int input1){
        int reversed = 0;
        int remainder = 0;
        int result = 0;
        int in = input1;

        while(input1 > 0) {
            remainder = input1 % 10;
            reversed = (reversed * 10) + remainder;
            input1/= 10;
        }
        if(reversed == in) {
            result = 2;
        } else {
            result = 1;
        }
        return result;  
    }    
}