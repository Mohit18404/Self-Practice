package java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/*
 * @author: mohit5.kumar
 * @created: 25/04/19
 */
public class Unit1Exercise {
    public static void main(String[] args) {
        List<Person> people= Arrays.asList(
                new Person("Charls","Dicken",60),
                new Person("Lewis","Caroll",42),
                new Person("thomas","Carlyl",51),
                new Person("Charlotte","Bronte",45),
                new Person("Mathew","Arnold",39));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName());
            }
        });

        System.out.println("print all elements");
        System.out.println();
        printAll(people);
        System.out.println();
        //printLastNameBeginningWithC(people);
        System.out.println("print last name starts with C");
        System.out.println();
        printWithCondition(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getLastName().startsWith("C");
            }
        });

        System.out.println("print first name starts with C");
        System.out.println();
        printWithCondition(people, new Condition() {
            @Override
            public boolean test(Person person) {
                return person.getFirstName().startsWith("C");
            }
        });


    }
    public static void printAll(List<Person> people){
        for (Person person:
             people) {
            System.out.println(person);
        }
    }

    /*public static void printLastNameBeginningWithC(List<Person> people){

        for (Person person:
                people) {
            if(person.getLastName().startsWith("C")) System.out.println(person);
        }
    }*/

    public static void printWithCondition(List<Person> people,Condition condition){

        for (Person person:
                people) {
            if(condition.test(person)) System.out.println(person);
        }
    }
}

interface Condition{
    public boolean test(Person person);
}