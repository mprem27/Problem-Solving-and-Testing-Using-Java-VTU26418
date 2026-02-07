public import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() { return name; }
    public int getAge() { return age; }

    public static boolean isOlderThanLimit(Person p, int limit) {
        return p.getAge() > limit;
    }
}
public class task4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            people.add(new Person(parts[0], Integer.parseInt(parts[1])));
        }
        int ageLimit = Integer.parseInt(sc.nextLine());

        List<Person> sortedPeople = new ArrayList<>(people);
        sortedPeople.sort(Comparator.comparing(Person::getName));
        String sortedNames = sortedPeople.stream()
                .map(Person::getName)
                .collect(Collectors.joining(" "));
        System.out.println(sortedNames);

        String olderThanLimit = people.stream()
                .filter(p -> Person.isOlderThanLimit(p, ageLimit))
                .map(Person::getName)
                .collect(Collectors.joining(" "));
        System.out.println(olderThanLimit);

        String upperNames = people.stream()
                .map(Person::getName)
                .map(String::toUpperCase) 
                .collect(Collectors.joining(" "));
        System.out.println(upperNames);

        sc.close();
    }
} {
    
}
