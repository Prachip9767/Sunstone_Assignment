/*
    Write a java program which initialize the earning of an employee. The program should calculate the income
    tax to be paid by the employee as per the criteria given below
*/
import java.util.Scanner;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("**** Welcome to Tax Calculator ****");
        System.out.println("Enter You Salary below");
        double salary = scanner.nextInt();
        System.out.println("Your Total income tax is:-"+CalculateTax(salary));
    }

    static double CalculateTax(double salary) {
        double taxAmount ;
        if (salary <= 50000)
            taxAmount = 0;
        else if (salary <= 60000)
            taxAmount = 0.1 * (salary - 50000);
        else if (salary <= 150000)
            taxAmount = (0.2 * (salary - 60000) + 1000); // 10% on additional amount
        else taxAmount = (0.3 * (salary - 150000) + 1000 + 18000); //10% + 20% on additional amount
        return taxAmount;
    }
}
/*
    10/100 =0.1.
 */