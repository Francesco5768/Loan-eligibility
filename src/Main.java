import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====LOAN APPLICATION SYSTEM=====");
        System.out.println("Enter name:");
        String name = input.nextLine();
        System.out.println("Enter age:");
        int age = input.nextInt();
        System.out.println("Enter salary:");
        float salary = input.nextFloat();
        System.out.println("Enter employed:");
        boolean employed = input.nextBoolean();
        System.out.print("Enter nationality:");
        String nationality = input.next();

        System.out.println("\nNAME:" + name);
        System.out.println("AGE:" + age);
        System.out.println("SALARY:" + salary);
        System.out.println("EMPLOYED:" + employed);
        System.out.println("NATIONALITY:" + nationality);

        if (age < 27|| employed == false || salary < 70000||!nationality.equalsIgnoreCase("Kenyan")) {

            System.out.println("LOAN INELIGIBLE");
        } else {
            System.out.println("LOAN ELIGIBLE");
        }
        input.close();
    }
    }

