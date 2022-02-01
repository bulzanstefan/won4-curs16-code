package ro.fasttrackit.optional;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Optional<String> ana = Optional.of("Ana");
//        Optional.of(null);
        Optional<String> name = getName();
        if (name.isPresent()) {
            System.out.println(name.get());
        } else {
            System.out.println("Optional is empty!");
        }

        System.out.println(name.orElse("Nu a venit!"));

        paramOptional(null);
    }

    private static Optional<String> getName() {
        if (System.nanoTime() % 2 == 0) {
            return Optional.empty();
        } else {
            return Optional.of("Hello");
        }
    }

    private static void paramOptional(String input) {
        if (input != null) {
            System.out.println(input);
        }
    }
}
