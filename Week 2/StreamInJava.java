

public class StreamInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        if (!sc.hasNextInt()) {
        	System.out.println("Not possible.");
        	sc.close();
        }
        int n = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        Integer result = numbers.stream()
                .distinct()                               
                .sorted(Comparator.reverseOrder())        
                .skip(1)                                 
                .findFirst()                             
                .orElse(-1);                            

        System.out.println(result);
        
        sc.close();
    }
}
