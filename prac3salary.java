
import java.util.Scanner;

public class prac3salary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] employee = new String[10];
        int[] id = new int[10];
        double[] basic_salary = new double[10];
        double[] house_rent_allowance = new double[10];
        double[] dearness_allowance = new double[10];
        double[] profession_tax = new double[10];
        double[] total_salary = new double[10];
        String[] address = new String[100];
        double[] take_home_salary = new double[10];

        System.out.println("Enter");
        for (int i = 0; i < 10; i++) {
            total_salary[i] = 0;
            System.out.print("Employee name : ");
            employee[i] = scan.next();
            System.out.print("Pincode : ");
            address[i] = scan.next();
            System.out.print("Enter id of employee : ");
            id[i] = scan.nextInt();
            System.out.print("Enter Basic salary : ");
            basic_salary[i] = scan.nextInt();
            total_salary[i] = total_salary[i] + basic_salary[i];
            house_rent_allowance[i] = (0.2) * (basic_salary[i]);
            total_salary[i] = total_salary[i] + house_rent_allowance[i];
            dearness_allowance[i] = (0.45) * (basic_salary[i]);
            total_salary[i] = total_salary[i] + dearness_allowance[i];
            profession_tax[i] = 0.7 * basic_salary[i];
            take_home_salary[i] = total_salary[i] - profession_tax[i];

        }
        System.out.println("The list of employees is :- ");
        System.out.println("Name    Id      Take home salary      Profession tax       Total salary");
        for (int i = 0; i < 10; i++) {
            System.out.print("" + employee[i]);
            System.out.print("\t" + id[i]);
            System.out.print("\t\t" + take_home_salary[i]);
            System.out.print("\t\t" + profession_tax[i]);
            System.out.print("\t\t\t" + total_salary[i]);
            System.out.println();

        }

    }

}
