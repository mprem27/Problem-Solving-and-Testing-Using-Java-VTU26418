
    class UserMainCode {

    public int Palindromestring(String input1){
        String s = input1.toLowerCase();

        int left = 0;

        int right = s.length() - 1;

        boolean isPalindrome = true;

        int result = 0;

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if(isPalindrome == false) {
            result = 1;
        } else {
            result = 2;
        }    
        return result;
        
    }    
}

