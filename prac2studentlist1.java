import java.util.Scanner;
public class prac2studentlist1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] Student = new String[10];
        int[] Rollno = new int[10];
        float[] Grade = new float[10];
        int[] maths = new int[10];
        int[] chem = new int[10];
        int[] physics = new int[10];
        int[] biology = new int[10];
        int[] evs = new int[10];
        System.out.println("Enter");
        for (int i = 0; i < 10; i++) {
            Grade[i] = 0;
            System.out.print("Roll no :");
            Rollno[i] = scan.nextInt();
            System.out.print("Name :");
            Student[i] = scan.next();
            System.out.print("maths :");
            maths[i] = scan.nextInt();
            Grade[i] = Grade[i] + maths[i];
            System.out.print("chem :");
            chem[i] = scan.nextInt();
            Grade[i] = Grade[i] + chem[i];
            System.out.print("physics :");
            physics[i] = scan.nextInt();
            Grade[i] = Grade[i] + physics[i];
            System.out.print("biology :");
            biology[i] = scan.nextInt();
            Grade[i] = Grade[i] + biology[i];
            System.out.print("evs :");
            evs[i] = scan.nextInt();
            Grade[i] = Grade[i] + evs[i];
            Grade[i] = Grade[i] / 50;
        }
        System.out.println("The list of Students is :- ");
        System.out.println("Roll no.        Name            grade   ");
        for (int i = 0; i < 10; i++) {
            System.out.print("" + Rollno[i]);
            System.out.print("\t\t" + Student[i]);
            System.out.print("\t\t" + Grade[i]);
            System.out.println();
        }
        System.out.println("The students above 8 grade are :-");
        System.out.println("Roll no.        Name            Grade");
        for (int i = 0; i < 10; i++) {
            if (Grade[i] >= 8) {
                System.out.print("" + Rollno[i]);
                System.out.print("\t\t" + Student[i]);
                System.out.print("\t\t" + Grade[i]);
                System.out.println();
            }
        }
    }
}
