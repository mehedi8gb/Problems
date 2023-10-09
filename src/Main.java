import IOHandler.InputHandler;
import IOHandler.ReverseModel;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        new InputHandler();
        ReverseModel.reverse();
        System.out.println("Reverse String: " + ReverseModel.show());
    }
}