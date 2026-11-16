import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====ZENKA LOAN APPLICATION=====");
        System.out.println("Enter name:");
        String name = input.nextLine();
        System.out.println("Enter age:");
        int age = input.nextInt();
        System.out.println("Enter salary:");
        float salary = input.nextFloat();
        System.out.println("Employed(true/false):");
        boolean employed = input.nextBoolean();
        input.nextLine();
        System.out.println("Enter Occupation:");
        String Occupation = input.nextLine();
        System.out.println("Enter nationality:");
        String nationality = input.nextLine();
        System.out.println("Enter loan amount to borrow:");
        double amount= input.nextDouble();
        System.out.println("Enter repayment period(years)");
        int years= input.nextInt();
        double interest_rate=7;
        double interest=(amount*interest_rate*years)/100;
        double Total_Repayable_amount=interest+amount;
        double monthly_payment=Total_Repayable_amount/(12*years);
        System.out.println("\nNAME:" + name);
        System.out.println("AGE:" + age);
        System.out.println("SALARY:" + salary);
        System.out.println("EMPLOYED:" + employed);
        System.out.println("Occupation:" + Occupation);
        System.out.println("NATIONALITY:" + nationality);
        System.out.println("Loan amount:"+amount);
        if (age < 27|| !employed  || salary < 100000||!nationality.equalsIgnoreCase("Kenyan")) {

            System.out.println("LOAN INELIGIBLE");
        } else if (amount>500000&&salary<800000) {
            System.out.println("LOAN INELIGIBLE");
        } else {
            System.out.println("LOAN ELIGIBLE");
            System.out.println("Interest:"+interest);
            System.out.println("Total Repayable amount:"+Total_Repayable_amount);
            System.out.println("Monthly Repayment:"+monthly_payment);
        }

        input.close();
    }
}