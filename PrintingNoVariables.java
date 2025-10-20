/// Printing text and numbers without variables.  Demonstrating difference between print() and println().
/// Text only, numbers only, text with numbers, numbers with text, calculations with numbers.

public class PrintingNoVariables {
    public static void main(String[] args) {

        System.out.println("Printing text with no variables.");
        System.out.print("Printing");
        System.out.print(" ");
        System.out.println("text.");
        System.out.print("Wo");
        System.out.println("rd.");

        System.out.println();

        System.out.println(100);
        System.out.println("Text and Numbers: " + 100);
        System.out.println(100 + " Numbers and Text.");

        System.out.println();

        System.out.println(100 + 1);
        System.out.println(100 + " " + 50);
        System.out.print(1);
        System.out.print(2);
        System.out.println(3);


    }
}