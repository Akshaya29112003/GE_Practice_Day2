package Line_Comparison_Problem;

import java.util.Scanner;

public class Line_Comparision {
    public static void main(String args[]){
        System.out.println("Welcome to Line Comparison Computation Program on Master Branch");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter coordinates for Line 1:");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        double length1 = uc1(x1, y1, x2, y2);
        System.out.println(length1);

        System.out.println("Enter coordinates for Line 2:");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();
        double x4 = sc.nextDouble();
        double y4 = sc.nextDouble();
        double length2 = uc1(x3, y3, x4, y4);
        System.out.println(length2);

        uc2(length1, length2);
        uc3(length1, length2);
    }

    public static double uc1(double x1, double y1, double x2, double y2){
        double ans = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        return ans;
    }

    public static void uc2(double length1, double length2){
        Double num1 = length1;
        Double num2 = length2;
        if(num1.equals(num2))   System.out.println("2 lenghts are equal");
        else    System.out.println("2 lengths are not equal");
    }

    public static void uc3(double length1, double length2){
        Double num1 = length1;
        Double num2 = length2;
        int compare = num1.compareTo(num2);
        if(compare == 0)    System.out.println("Both lines are equal");
        else if(compare > 1)   System.out.println("First length is longer");
        else   System.out.println("Second length is longer");

    }
}
