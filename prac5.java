import java.util.Scanner;
public class prac5 {
    static void FirstAndLast(String str) {
        int n = str.length();
        System.out.println("first character is : " + str.charAt(0));
        System.out.println("last character is : " + str.charAt(n - 1));
        System.out.println("The middle characters of the string are : " + str.substring(1, n - 1));
    }
    static void Initialletters(String b) {
        Scanner scan = new Scanner(System.in);
        String[] arr = b.split(" ");
        for (String a : arr)
            System.out.print(a.charAt(0));
    }
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any string :");
        String str = scan.nextLine();
        FirstAndLast(str);
        System.out.print("Enter any name :");
        String b = scan.nextLine();
        System.out.print("Monogram consisting of initial letters is : ");
        Initialletters(b);
    }
}

