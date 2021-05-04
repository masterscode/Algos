package functional_programming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("taiwo", Gender.MALE),
                new Person("kenny", Gender.MALE),
                new Person("mary", Gender.FEMALE));

        people
                .stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }

    static class Person{
        private final String name;
        private final Gender gender;

        Person (String name, Gender gender){
            this.name = name;
            this.gender = gender;
        }
        @Override
        public String toString(){
            return this.name + " " + this.gender;
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
