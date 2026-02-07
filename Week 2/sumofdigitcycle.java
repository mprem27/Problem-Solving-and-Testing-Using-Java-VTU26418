import java.io.*;
import java.util.*;

class UserMainCode {

    public int sumOfSumsOfDigits (int input1){

        String num = Integer.toString(input1);
        int sum = 0;
        for(int i = 0; i < num.length();i++) {
            int currSum = 0;
            for(int j = i;j < num.length();j++) {
                currSum += num.charAt(j) - '0';
            }
            sum += currSum;
        }
        return sum;
    }    
}