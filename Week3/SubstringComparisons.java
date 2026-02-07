
    import java.util.Scanner;

public class SubstringComparisons {

public static String getSmallestAndLargest(String s, int k) {
    String substring = s.substring(0, k);
    String smallest = substring;
    String largest = substring;
    for (int i = 1; i <= s.length() - k; i++) {
        String current = s.substring(i, i + k);
        if (current.compareTo(smallest) < 0) {
            smallest = current;
        }
        if (current.compareTo(largest) > 0) {
            largest = current;
        }
    }
    
    return smallest + "\n" + largest;
}
}
