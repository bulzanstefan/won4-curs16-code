package ro.fasttrackit.generics;

public class PersonBox<T extends Being> {
    private final T person;

    public PersonBox(T person) {
        this.person = person;
    }

    public T getPerson() {
        return person;
    }
}
