package HeackerRank;

import java.time.Period;
import java.util.Scanner;

/*
 * @author: mohit5.kumar
 * @created: 14/03/19
 */
public class Problem11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}

class Person1 {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    // Constructor
    Person1(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }
    // Print person data
    public void printPerson() {
        System.out.println(
                "Name: " + lastName + ", " + firstName
                        + "\nID: " + idNumber);
    }

}

class Student extends Person1 {
    private int[] testScores;
    Student(String firstName, String lastName, int idNumber, int[] testScores){
        super(firstName,lastName,idNumber);
        this.testScores=testScores;
    }
    public String calculate(){
        int sum=0;
        for(int i=0;i<testScores.length;i++){
            sum=sum+testScores[i];
        }
        sum=sum/testScores.length;
        if(sum>=90 && sum<=100){
            return "O";
        }else if(sum>=80 && sum<=90){
            return "E";
        }else if(sum>=70 && sum<=80){
            return "A";
        }else if(sum>=60 && sum<=70){
            return "P";
        }else if(sum>=50 && sum<=60){
            return "D";
        }else if(sum>=40 && sum<=50){
            return "T";
        }
        return "";
    }
}

