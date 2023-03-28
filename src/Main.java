import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Мария", "Секретовая", 18));
        people.add(new Person("Виктория", "Блюз", 20));
        people.add(new Person("Оля", "Половойкаватая", 50));
        people.add(new Person("Аня", "Ляля", 35));
        people.add(new Person("Аня", "Бойковатая", 55));

        Comparator<Person> surnameLengthComporator = (o1, o2) -> {
            if (o1.getSurname().length() < o2.getSurname().length()){
                return 1;
            } else if (o1.getSurname().length() > o2.getSurname().length()){
                return -1;
            } else {
                return Integer.compare(o2.getAge(), o1.getAge());
            }
        };


        System.out.println(people);
        Collections.sort(people, surnameLengthComporator);
        System.out.println(people);

    }
}