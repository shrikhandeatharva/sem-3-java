                           // Printing name,rollno.,marks of students along with handling the exceptions //
import java.util.*;
class negativerollexception extends Exception{
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Roll number cannot be negative.";
    }
}
class markscantbenegativeexception extends Exception{
    @Override
    public String getMessage() {
        // TODO Auto-generated method stub
        return "Entered marks should be between 0 to 100.";
    }
}
public class prob8 {
    public static void no1(int roll) throws negativerollexception{
        throw new negativerollexception();
    }
    public static void no2(int num) throws markscantbenegativeexception{
        throw new markscantbenegativeexception();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] name = new String[4];
        int[] Rollno = new int[4];
        int[] maths = new int[4];
        int[] physics = new int[4];
        int[] chem = new int[4];
        int i;
        for(i=1;i<=3;i++){
            System.out.print("Enter roll number of student "+i+" : ");
            Rollno[i] = sc.nextInt();
            
            if(Rollno[i]<0){
            try{
                no1(Rollno[i]);
                // no1(5);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.print("Enter Roll number of student "+i+" again : ");
                Rollno[i] = sc.nextInt();
            }
        }
        System.out.print("Enter Name of student "+i+" : ");
            name[i] = sc.next();
            System.out.print("Enter marks  of student "+i+" in Maths : ");
            maths[i] = sc.nextInt();
            if(maths[i]<0 || maths[i]>100){
                try{
                    no2(maths[i]);
                }
                catch(Exception e1){
                    System.out.println(e1.getMessage());
                    System.out.print("Enter marks of student "+i+" in maths again : ");
                    maths[i] = sc.nextInt();
                }
            }
            System.out.print("Enter marks  of student "+i+" in Physics : ");
            physics[i] = sc.nextInt();
            if(physics[i]<0 || physics[i]>100){
                try{
                    no2(physics[i]);
                }
                catch(Exception e2){
                    System.out.println(e2.getMessage());
                    System.out.print("Enter marks of student "+i+" in physics again : ");
                    physics[i] = sc.nextInt();
                }
            }
            System.out.print("Enter marks  of student "+i+" in Chemistry : ");
            chem[i] = sc.nextInt();
            if(chem[i]<0 || chem[i]>100){
                try{
                    no2(chem[i]);
                }
                catch(Exception e3){
                    System.out.println(e3.getMessage());
                    System.out.print("Enter marks of student "+i+" in chemistry again : ");
                    chem[i] = sc.nextInt();
                }
            }
        }
        System.out.println("The list of Students is :- ");
        System.out.println("Roll no.        Name            maths          physics         chemistry   ");
        for ( i=1; i<=3;i++) {
            System.out.print("" + Rollno[i]);
            System.out.print("\t\t" + name[i]);
            System.out.print("\t\t" + maths[i]);
            System.out.print("\t\t" + physics[i]);
            System.out.print("\t\t" + chem[i]);
            System.out.println();
        }
        sc.close();
    }

}
