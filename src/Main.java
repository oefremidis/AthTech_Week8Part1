public class Main {

    public static void main(String[] args) {
        Utilities utilities = new Utilities();

//            utilities.divideIt();
//        System.out.println(utilities.sqrt(-10));
        try {
            utilities.setAge(1);
        } catch (NegativeAgeException e){
            System.out.println(e.getMessage());
        }
    }
}

// handle exceptions or throw them
//    public static void main(String[] args) { // throws Exception {
////      Utilities utilities = new Utilities();
////      utilities.divideIt();
//
//        try {
//            new Utilities().divideIt();
//        } catch(Exception e){
//            System.out.println("Sorry by main...");
//        }
//    }