public class hillweight {

public int totalhillweight(int input1, int input2, int input3) {
    int totalweight = 0;
    int currentweight = input2;

    for (int i = 0; i < input1; i++) { 
        for (int j = 0; j <= i; j++) { 
            totalweight += currentweight;
        }
        currentweight += input3; 
    }
    return totalweight;
}
}