/*
 * Commission Calculator
 * Week 3 Individual Assignment
 * Christopher Petrovich
 * PRG420
 * Vince Anderson
 * 09/20/2015
 */

public class SalesPerson {

    //Private Variables of the salesPerson class
    private final double fixedSalary = 35750;
    private final double salesTarget = 125250;
    private final float minimumSales = 0.80f;
    private final double commissionRate = 0.12;
    private final float accelerationFactor = .0175f;

    public double compensation(double annualSales) {
        //Calculate the total annual compensation.

        double minSalesCalc = salesTarget * minimumSales; //Calculate minuimum sales required for Commission.

        int differ = Double.compare(annualSales, minSalesCalc);
        // if the differ variable is negative, the annualSales is considered smaller than the minSalesCalc
        // if the differ variable is positive, the annualSales is considered larger than the minSalesCalc
        // if the differ variable is 0, the values are considered to be equal.

        if (differ >= 0) {// Check Sale person exceeds 80% of sales target or not
            minSalesCalc = fixedSalary;
            if (annualSales > salesTarget) { // Check Sale person exceeds of sales target or not 
                minSalesCalc += annualSales * commissionRate;
                minSalesCalc += (annualSales - salesTarget) * accelerationFactor;// add acceleration factor of 1.75%
            } else {
                minSalesCalc += annualSales * commissionRate;
            }
            return Math.round(minSalesCalc);
        } else {
            return fixedSalary;
        }
    }
}
