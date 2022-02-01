package ro.fasttrackit.generics;

interface Being {
}

public class Person implements Being {
    private final String name;

    Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Employee extends Person {
    private final int salary;

    public Employee(String name, int salary) {
        super(name);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
