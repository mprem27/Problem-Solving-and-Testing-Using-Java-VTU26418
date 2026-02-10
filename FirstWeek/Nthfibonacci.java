import java.io.*;
import java.util.*;

class UserMainCode {

    public long nthFibonacci(int input1) {

        long a = 0;
        long b = 1;
        long c = 0;
        long result = 0;

        if(input1 <= 0) {
            System.out.println("Not possilble.");
        } else if(input1 == 1) {
            result = a;
        } else if(input1 == 2) {
            result = b;
        } else {
            for(int i = 3; i <= input1; i++) {
                c = a + b;
                a = b;
                b = c;
            }
            result = c;
        }
        return result;    
    }
}    