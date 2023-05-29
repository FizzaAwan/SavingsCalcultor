
import java.util.Scanner;
public class Project1{
    public static void main (String[] args)
    { 
    // declare and assign at the same time
    Scanner in = new Scanner(System.in);
    
    //questions
    System.out.println("What is your monthly salary?");
    
    double monthlySalary = in.nextDouble();
    
    System.out.println("What is your monthly rent?");
    
    double monthlyRent = in.nextDouble();
    
    System.out.println("What are your monthly costs?");
    
    double monthlyCost = in.nextDouble();
    
    System.out.println("How much do you want to save at the end of the year?");
    
    // equations
    double annualSavings = in.nextDouble();
    
    double monthlySavings = annualSavings/12;
    
    double disposableIncome = monthlySalary- monthlyRent- monthlyCost- monthlySavings;
    

    System.out.printf("____________________________________________________________\n");
    System.out.printf("| %-20s | %20s |\n", "Salary", monthlySalary);
    System.out.printf("| %-20s | %20s |\n", "Rent", monthlyRent); 
    System.out.printf("| %-20s | %20s |\n", "Cost", monthlyCost);    
    System.out.printf("| %-20s | %20s |\n", "Savings", annualSavings);   
    System.out.printf("____________________________________________________________\n");
    System.out.printf("| %-20s | %20s |\n", "Savings Per Month", monthlySavings);
    System.out.printf("| %-20s | %20s |\n", "Disposable Income", disposableIncome); 
    }
}