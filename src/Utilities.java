import java.util.InputMismatchException;
import java.util.Scanner;

public class Utilities {

    private int age;

    public void setAge(int age) throws NegativeAgeException {
        if (age > 0) {
            this.age = age;
        } else {
           throw new NegativeAgeException("No negative ages please...");
        }
    }

    public String sqrt(int num) {
        try {
            return ""+ Math.sqrt(num);
        } catch (Exception e) {
            return "Something wrong";
        } finally {
            System.out.println("Sorry... by sqrt");
        }
    }

    public void divideIt() {

        Scanner read = new Scanner(System.in);

        try {
            System.out.print("Enter dividend : ");
            int dividend = read.nextInt();

            System.out.print("Enter divider : ");
            int divider = read.nextInt();

            System.out.println(dividend / divider);
        }
        catch (ArithmeticException e) {
            System.out.println("Do not divide by zero...");
        } catch (InputMismatchException e) {
            System.out.println("Wrong type...");
        } catch (Exception e){
            System.out.println("Sorry by divideIt...");
        } finally {
            System.out.println("Housekeeping...");
        }

        System.out.println("My code continues here....");
    }
}

//    public void divideIt() throws Exception{
//
//        Scanner read = new Scanner(System.in);
//
//        System.out.print("Enter dividend : ");
//        int dividend = read.nextInt();
//
//        System.out.print("Enter divider : ");
//        int divider = read.nextInt();
//
//        System.out.println(dividend / divider);
//
//        System.out.println("My code continues here....");
//    }

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
//            System.out.println("Sorry by divideIt...");
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
