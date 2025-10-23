/*

 */
public class PrintingWithVariables {
    public static void main(String[] args) {

        System.out.println("String, int and double are common data types.");

        String varInfoOne = "Printing variables";
        System.out.println(varInfoOne);


        int numDays = 7;
        System.out.println("Number of days in a week: " + numDays);
        System.out.printf("Number of days in a week: %d\n", numDays);

        numDays = 5;
        System.out.printf("There are only %d days in a work week.\n", numDays);

        double gravity = 9.81;
        System.out.printf("The value of gravity is %.2f m/s^2.\n", gravity);

    }
}