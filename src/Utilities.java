import java.util.Scanner;

public class Utilities {

    public void divideIt() throws Exception{

        Scanner read = new Scanner(System.in);

        System.out.print("Enter dividend : ");
        int dividend = read.nextInt();

        System.out.print("Enter divider : ");
        int divider = read.nextInt();

        System.out.println(dividend / divider);

        System.out.println("My code continues here....");
    }
}

// just a try catch
//    public void divideIt() {
//
//        try {
//            Scanner read = new Scanner(System.in);
//
//            System.out.print("Enter dividend : ");
//            int dividend = read.nextInt();
//
//            System.out.print("Enter divider : ");
//            int divider = read.nextInt();
//
//            System.out.println(dividend / divider);
//        } catch (Exception e){
//            System.out.println("Sorry... come back later...");
//        }
//
//        System.out.println("My code continues here....");
//    }

// using ifs...
//    public void divideIt() {
//
//        Scanner read = new Scanner(System.in);
//
//        System.out.print("Enter dividend : ");
//        int dividend = read.nextInt();
//
//        if (dividend != 0) {
//            System.out.print("Enter divider : ");
//            int divider = read.nextInt();
//            if (divider != 0) {
//                System.out.println(dividend / divider);
//            }
//        }
//    }
//            }
