package Enum;

/*
 * @author: mohit5.kumar
 * @created: 27/04/19
 */

enum Day
{
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY;
    Day(){
        System.out.println("constructor "+this.toString());
    }
}