package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * @author: mohit5.kumar
 * @created: 25/04/19
 */
public class TestWithJava8 {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Charls","Dicken",60),
                new Person("Lewis","Caroll",42),
                new Person("thomas","Carlyl",51),
                new Person("Charlotte","Bronte",45),
                new Person("Mathew","Arnold",39));
        Collections.sort(people, (o1, o2)-> o1.getLastName().compareTo(o2.getLastName()));

        System.out.println("print all elements");
        System.out.println();
        printWithCondition(people,person->true);

        System.out.println();
        System.out.println("print last name starts with C");
        System.out.println();
        printWithCondition(people, person -> person.getLastName().startsWith("C"));

        System.out.println("print first name starts with C");
        System.out.println();
        printWithCondition(people, person -> person.getFirstName().startsWith("C"));
    }

    public static void printWithCondition(List<Person> people,Condition condition){

        for (Person person:
                people) {
            if(condition.test(person)) System.out.println(person);
        }
    }
}