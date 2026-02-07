
 import java.io.*;
import java.util.*;

class UserMainCode {

    public int digitcount(int input1) {

        int result = 1;
        String str = Integer.toString(input1);
        int size = str.length();

        for(int i = 0; i < size - 1;i++) {
            if(input1 >= 1 && input1 <= 25000) {
            input1 = input1 / 10;
            result++;
        }
    }
    return result;
    }
}

