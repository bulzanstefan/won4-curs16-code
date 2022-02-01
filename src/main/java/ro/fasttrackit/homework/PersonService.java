package ro.fasttrackit.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

record Person(int id, String name) {
}

public class PersonService {
    private final List<Person> persons = new ArrayList<>();

    public Optional<Person> getPersonById(int id) {
        for (Person person : persons) {
            if (person.id() == id) {
                return Optional.of(person);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<Person> person = new PersonService().getPersonById(33);

        if (person.isPresent()) {
            System.out.println(person.get().name());
        } else {
            System.out.println("Nu exista persoana cu id 33");
        }
    }
}
