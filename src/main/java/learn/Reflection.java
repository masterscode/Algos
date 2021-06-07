package learn;

import data_structures.BasicStack;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.stream.Stream;

public class Reflection {
    public static void main(String[] args) {
        Class<BasicStack> reflectionClass = BasicStack.class;

        Field[] allFields = reflectionClass.getDeclaredFields();

        Arrays.stream(allFields)
                .map(Field::getName)
                .forEach(System.out::println);
        System.out.println("======fields========");
        Stream.of(allFields).forEach(System.out::println);

        Method[] methods = reflectionClass.getDeclaredMethods();

        System.out.println("======methods========");

        Arrays.stream(methods)
                .map(Method::getName)
                .forEach(System.out::println);
    }
}
