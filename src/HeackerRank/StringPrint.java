package HeackerRank;

import java.util.Scanner;

/*
 * @author: mohit5.kumar
 * @created: 16/02/19
 */
public class StringPrint {
    public void display(double meal_cost,int tip_percent,int tax_percent){
        double tip=(meal_cost*tip_percent)/100;
        double tax=(meal_cost*tax_percent)/100;
        int total=(int)(meal_cost+tip+tax);
        System.out.println(total);
    }
    public static void main(String[] args) {
        StringPrint stringPrint=new StringPrint();
        stringPrint.display(10.25,17,5);

    }
}
