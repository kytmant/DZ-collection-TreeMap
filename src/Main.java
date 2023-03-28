import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Мария", "Секретовая", 18));
        people.add(new Person("Виктория", "Блюз", 15));
        people.add(new Person("Оля", "Половойкаватая", 50));
        people.add(new Person("Аня", "Ляля", 35));
        people.add(new Person("Аня", "Бойковатая", 55));
        people.add(new Person("Ванюша", "Болобойка", 16));

        Predicate<Person> comingOfAge = p -> p.getAge() < 18;

        System.out.println(people);
        people.removeIf(comingOfAge);
        Collections.sort(people, new SurnameLengthComporator());
        System.out.println(people);

    }
}