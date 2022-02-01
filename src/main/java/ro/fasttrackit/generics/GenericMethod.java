package ro.fasttrackit.generics;

public class GenericMethod {

    public static <T extends Number> String append(String message, T count) {
        return message + " " + count.intValue();
    }

//    public void altaMetoda(T input){
//
//    }
}
