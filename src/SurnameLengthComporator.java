import java.util.Comparator;

public class SurnameLengthComporator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getSurname().length() < o2.getSurname().length()){
            return 1;
        } else if (o1.getSurname().length() > o2.getSurname().length()){
            return -1;
        } else {
            return Integer.compare(o2.getAge(), o1.getAge());
        }
    }
}
