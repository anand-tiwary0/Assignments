package overloading;

import java.util.Scanner;

public class Main extends Overloadingexample {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);
        System.out.printf("choose right option \n 1 : circle \t 2: rectangle \t 3: triangle \t 4 : cylinder \t 5 : square \n");
        choice = input.nextInt();


        switch (choice){
            case 1 :
                float radius;
                System.out.println("you choice circle");
                System.out.print("enter radius of cirle :: ");
                radius = input.nextFloat();
                System.out.println(area(radius));
                break;
            case 2 : double length, breadth;
                System.out.println("you choose rectangle");
                System.out.print("enter len, width of rectangle :: ");
                length = input.nextDouble();
                breadth = input.nextDouble();
                System.out.println(area(length,breadth));
                break;
            case 3 :
                System.out.println("you choose triangle");
                System.out.print("enter height and base of triangle :: ");
                length = input.nextDouble();
                radius = input.nextFloat();
                System.out.println(area(length,radius));
                break;
            case 4 :
                System.out.println("you choose cylinder");
                System.out.print("entere radius and height of cylinder :: ");
                radius = input.nextFloat();
                float height = input.nextFloat();
                System.out.println(area(radius,height));
                break;

            case 5 :
                System.out.println("you choose squere");
                System.out.print("enter side lenght of the square :: ");
                length = input.nextDouble();
                System.out.println(area(length));
            default:
                System.out.println("wrong choice byeee ! ");
        }
    }
}
