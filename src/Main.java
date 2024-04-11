
import javax.swing.*;
import java.lang.*;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) throws NullPointerException {
        Scanner sc5;
        Scanner sc4;
        Scanner sc3;
        Scanner sc6;
        String Yes;
        double c = 0;
        double b = 0;
        double a = 0;
        double fort = 0;
        double fort1 = 0;
        double discriminant = 0;
        try {
            fort = 0;
            fort1 = 0;
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Your Quadratic Formula Values: ");

            b = 0;
            Yes = "Y";
            a = 0;
            c = 0;
            sc6 = null;
            sc5 = null;
            sc4 = null;
            sc3 = null;
            a = Double.parseDouble(JOptionPane.showInputDialog("A (Value like this - Ax^2"));
            b = Double.parseDouble(JOptionPane.showInputDialog("B (BX): "));
            c = Double.parseDouble(JOptionPane.showInputDialog("C (C): "));
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Would You Like To Proceed Or Go Back (Y/N)");
            Yes = scanner2.nextLine();
            if (Yes.toUpperCase().equals("N")) {
                a = Double.parseDouble("Y");


            } else {

            }
            discriminant = (b * b - 4*a*c);

            if ((double) a != a || (double) b != b || (double) c != c) {
                System.out.println("Error, Values Are Not Real");
            }


            if (2 * a == 0 || Math.pow(b, 2) != b * b) {
                System.out.println("Can Not Do");
            }

            if (discriminant == 0) {
                System.out.println("One Solution");
            } else if (discriminant > 0) {
                System.out.println("2 Solutions");
            } else if (discriminant < 0
            ) {
                System.out.println("No Real Solutions");
            }
            double x = 0;

            fort = (-1 * b - Math.sqrt(discriminant)) / 2*a;
            fort1 = (-1 * b + Math.sqrt(discriminant)) / 2*a;


            if (fort == 0 || fort == 0) {
                double y = (-1 * b + Math.sqrt(discriminant) / (2 * a));
                double z = (-1 * b - Math.sqrt(discriminant) / (2 * a));
                fort = 0 - y;
                fort1 = 0 - z;

            } else {
            }

            System.out.println("Your Two Values Are: x = " + fort + " and x = " + fort1);
        } catch (Exception e) {

            System.out.println("Error: " + e);
            sc3 = new Scanner(System.in);
            System.out.println("A: ");
            a = sc3.nextDouble();
            sc4 = new Scanner(System.in);
            System.out.println("B: ");
            b = sc4.nextDouble();
            sc5 = new Scanner(System.in);
            System.out.println("C: ");
            c = sc5.nextDouble();
            discriminant = (b * b - 4*a*c);
            sc6 = new Scanner(System.in);
            System.out.println("Would You Like To Proceed Or Go Back (Y/N)");
            Yes = sc6.nextLine();
            double y = (-1 * b + Math.sqrt(discriminant)) / 2*a;
            double z =(-1 * b - Math.sqrt(discriminant)) / 2*a;

            System.out.println("x: " + y + " x: " + z + "disc " + discriminant);

        }

    }


}

