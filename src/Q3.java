import java.util.*;
public class Q3 {
    public static float pi = 22/7f;

    public static void area_circle(){
        System.out.println("Enter radius");
        Scanner sc= new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println(pi*r*r);

    }

    public static void cir_cur(){
        System.out.println("Enter radius");
        Scanner sc= new Scanner(System.in);
        float r = sc.nextFloat();
        System.out.println(2*pi*r);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("1. Calculate Area of Circle");
        System.out.println("2. Calculate Circumference of a Circle");
        System.out.println("3. Exit");

        int ch = sc.nextInt();
        switch(ch){
            case 1:
                    area_circle();
                    break;
            case 2:
                    cir_cur();
                    break;
            default:
                    System.out.println("Wrong input");
        }
    }
}
