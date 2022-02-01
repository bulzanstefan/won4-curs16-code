package ro.fasttrackit.generics;

public class Main {
    public static void main(String[] args) {
        OldBox old1 = new OldBox("Ana");
        OldBox old2 = new OldBox(1);

//        old2.setItem("Mihai");
        Object item = old1.getItem();
        boxUser(old1);
//        boxUser(old2);

        Box<String> new1 = new Box<>("Ana");
        Box<Integer> new2 = new Box<>(1);

        String newItem = new1.getItem();
        newboxUser(new1);
//        newboxUser(new2);

        Person ana = new Person("Ana");
        PersonBox<Person> personBox = new PersonBox<>(ana);
        PersonBox<Employee> employeeBox = new PersonBox<>(new Employee("Radu", 1000));
        PersonBox<Person> anotherPersonBox = new PersonBox<>(new Employee("Mihai", 2002));

        Pair<String, Integer> stringPair = new Pair<>("abc", 5);
        Pair<Person, Double> personPair = new Pair<>(ana, 2.3);
        System.out.println(stringPair.getSecond());
        System.out.println(personPair.getSecond());

        System.out.println(GenericMethod.append("salut", 3));
        System.out.println(GenericMethod.append("salut", 3.2));
        System.out.println(GenericMethod.append("salut", new Float(3.33)));
    }

    private static void newboxUser(Box<String> box) {
        String item = box.getItem();
        System.out.println(item.length());
    }

    private static void boxUser(OldBox box) {
        String value = (String) box.getItem();
        System.out.println(value.length());
    }
}
