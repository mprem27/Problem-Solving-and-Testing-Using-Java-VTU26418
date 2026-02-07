 import java.util.*;

class SortthePeople {
    public String[] sortPeople(String[] names, int[] heights) {
        int n = names.length;
        
        TreeMap<Integer, String> map = new TreeMap<>(Collections.reverseOrder());
        
        for (int i = 0; i < n; i++) {
            map.put(heights[i], names[i]);
        }
        
        String[] result = new String[n];
        int index = 0;
        for (int height : map.keySet()) {
            result[index++] = map.get(height);
        }
        
        return result;
    }
}   

