/*
 * Commission Calculator
 * Week 3 Individual Assignment
 * Christopher Petrovich
 * PRG420
 * Vince Anderson
 * 09/20/2015
 */

import java.util.Scanner;


public class Commission {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        String name;
        double annualSales;

        Scanner input = new Scanner(System.in); // enables keyboard input

        System.out.print("Please enter annual sales: ");//Prompts user for sales
        annualSales = input.nextDouble();

        SalesPerson salesPerson = new SalesPerson(); // enables salesPerson class

        System.out.println("Total Compensation: " //displays Total commission
                + Math.round((salesPerson.compensation(annualSales))));

        System.out.println(); // print blank line
        System.out.println("Total Sales\tTotal Compensation");//Print column names

        double annualSalesCalc = annualSales * 1.50;

        while (annualSales <= annualSalesCalc) {
            System.out.println(Math.round((annualSales)) + "\t\t" + //print sales and compensation
                    Math.round((salesPerson.compensation(annualSales))));
            annualSales = annualSales + 5000;
        }

    }
}
